package space.ifel.legacy.sessions;

import java.net.InetAddress;
import java.util.Date;

public class Session {
    private Long sessionId;
    private InetAddress clientIp;
    private Long expires;

    public Session(Long sessionId, InetAddress clientIp) {
        setSessionId(sessionId);
        setClientIp(clientIp);
        setExpires(expires());
    }

    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    public InetAddress getClientIp() {
        return clientIp;
    }

    public void setClientIp(InetAddress clientIp) {
        this.clientIp = clientIp;
    }

    public Long getExpires() {
        return expires;
    }

    public void setExpires(Long expires) {
        this.expires = expires;
    }

    private Long time() {
        return new Date().getTime() / 1000L;
    }

    private Long expires() {
        return time() + (60 * 15);
    }

    public void refresh() {
        setExpires(expires());
    }

    public Boolean valid() {
        return expires > time();
    }

    public Boolean expired() {
        return !valid();
    }

    public Session get() {
        return this;
    }
}
