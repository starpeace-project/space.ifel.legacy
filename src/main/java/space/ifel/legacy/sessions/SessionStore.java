package space.ifel.legacy.sessions;

import java.net.InetAddress;
import java.util.ArrayList;

class SessionStore {
    private static final ArrayList<Session> sessionStore = new ArrayList<>();
    private static final ArrayList<Long> sessionIds = new ArrayList<>();
    private static Boolean locked = false;

    private void getLock() {
        while (locked.equals(true)) {
            // Wait
        }
        locked = true;
    }

    private void releaseLock() {
        locked = false;
    }

    private Long getSessionId() {
        long sessionId = 0;
        do {
            sessionId = (long) (Math.random() * 1000000000000L);
        } while (sessionIds.contains(sessionId));

        sessionIds.add(sessionId);

        return sessionId;
    }

    private Session getSessionByInetAddress(InetAddress clientIp) {
        for (Session session : sessionStore) {
            if (session.getClientIp().equals(clientIp)) {
                session.refresh();
                return session;
            }
        }

        return null;
    }

    private Session getSessionById(Long sessionId) {
        for (Session session : sessionStore) {
            if (session.getSessionId().equals(sessionId)) {
                session.refresh();
                return session;
            }
        }

        return null;
    }

    private Session createSession(InetAddress clientIp) {
        Session session = new Session(getSessionId(), clientIp);
        sessionIds.add(session.getSessionId());
        sessionStore.add(session);

        return session;
    }

    public Session newSession(InetAddress clientIp) {
        getLock();
        Session newSession = createSession(clientIp);
        releaseLock();

        return newSession;
    }

    public Object lookupSession(Long sessionId) {
        getLock();
        Session byId = getSessionById(sessionId);

        if (byId != null && byId.valid()) {
            releaseLock();
            return byId;
        }

        sessionIds.remove(sessionId);
        sessionStore.remove(byId);
        releaseLock();

        return 107;
    }
}

