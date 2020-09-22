package space.ifel.legacy.enums;

import space.ifel.legacy.commands.EnableEvents;

/**
 * This enum is for regex patterns to pull data from the relevant command
 */
public enum ParameterPattern {
    IDOF                        ("C\\s(\\d+?)\\sidof\\s\"(.+?)\""),
    SEL                         ("C\\s(\\d+?)\\ssel\\s(.+?)\\s"),
    RDOOPENSESSION              ("C\\s(\\d+?)\\ssel\\s(\\d+?)\\sget"),
    RDOMAPSEGAUSER              ("C\\s(\\d+?)\\ssel\\s(.+?)\\scall\\sRDOMapSegaUser\\s\"\\^\"\\s\"(.+?)\""),
    RDOLOGONUSER                ("C\\s(\\d+?)\\ssel\\s(.+?)\\scall\\sRDOLogonUser\\s\"\\^\"\\s\"(.+?)\",\"(.+?)\""),
    RDOENDSESSION               ("C\\s(\\d+?)\\ssel\\s(\\d+?)\\scall"),
    RDOQUERYKEY                 ("C\\s(\\d+?)\\ssel\\s(.+?)\\scall\\sRDOQueryKey\\s\"\\^\"\\s\"(.+?)\",\"(.+?)\""),
    WORLDNAME                   ("C\\s(\\d+?)\\ssel\\s(\\d+?)\\sget"),
    WORLDURL                    ("C\\s(\\d+?)\\ssel\\s(\\d+?)\\sget"),
    DAADDR                      ("C\\s(\\d+?)\\ssel\\s(\\d+?)\\sget"),
    DALOCKPORT                  ("C\\s(\\d+?)\\ssel\\s(\\d+?)\\sget"),
    MAILADDR                    ("C\\s(\\d+?)\\ssel\\s(\\d+?)\\sget"),
    MAILPORT                    ("C\\s(\\d+?)\\ssel\\s(\\d+?)\\sget"),
    WORLDXSIZE                  ("C\\s(\\d+?)\\ssel\\s(\\d+?)\\sget"),
    WORLDYSIZE                  ("C\\s(\\d+?)\\ssel\\s(\\d+?)\\sget"),
    WORLDSEASON                 ("C\\s(\\d+?)\\ssel\\s(\\d+?)\\sget"),
    ACCOUNTSTATUS               ("C\\s(\\d+?)\\ssel\\s(.+?)\\scall\\sAccountStatus\\s\"\\^\"\\s\"(.+?)\",\"(.+?)\""),
    LOGON                       ("C\\s(\\d+?)\\ssel\\s(.+?)\\scall\\sLogon\\s\"\\^\"\\s\"(.+?)\",\"(.+?)\""),
    MAILACCOUNT                 ("C\\s(\\d+?)\\ssel\\s(\\d+?)\\sget"),
    TYCOONID                    ("C\\s(\\d+?)\\ssel\\s(\\d+?)\\sget"),
    SEGMENTSINAREA              ("C\\s(\\d+?)\\ssel\\s(\\d+?)\\scall\\sSegmentsInArea\\s\"\\^\"\\s\"(.+?)\",\"(.+?)\",\"(.+?)\",\"(.+?)\",\"(.+?)\""),
    SHOWNOTIFICATION            ("C\\ssel\\s(\\d+?)\\scall\\sShowNotification\\s\"\\*\"\\s\"(.+?)\",\"(.+?)\",\"(.+?)\",\"(.+?)\""),
    REFRESHTYCOON               ("C\\ssel\\s(\\d+?)\\scall\\sRefreshTycoon\\s\"\\*\"\\s\"(.+?)\",\"(.+?)\",\"(.+?)\",\"(.+?)\",\"(.+?)\""),
    SERVERBUSY                  ("C\\s(\\d+?)\\ssel\\s(\\d+?)\\sget"),
    SETVIEWEDAREA               ("C\\ssel\\s(\\d+?)\\scall\\sSetViewedArea\\s\"\\*\"\\s\"(.+?)\",\"(.+?)\",\"(.+?)\",\"(.+?)\""),
    OBJECTSINAREA               ("C\\s(\\d+?)\\ssel\\s(\\d+?)\\scall\\sObjectsInArea\\s\"\\^\"\\s\"(.+?)\",\"(.+?)\",\"(.+?)\",\"(.+?)\""),
    REFRESHAREA                 ("C\\ssel\\s(\\d+?)\\scall\\sRefreshArea\\s\"\\*\"\\s\"(.+?)\",\"(.+?)\",\"(.+?)\",\"(.+?)\",\"(.+?)\""),
    RDOCNNTID                   ("C\\s(\\d+?)\\ssel\\s(\\d+?)\\sget"),
    REGISTEREVENTSBYID          ("C\\s(\\d+?)\\ssel\\s(\\d+?)\\scall\\sRegisterEventsById\\s\"\\^\"\\s\"(.+?)\""),
    SETLANGUAGE                 ("C\\ssel\\s(\\d+?)\\scall\\sSetLanguage\\s\"\\*\"\\s\"(.+?)\""),
    INITCLIENT                  ("C\\ssel\\s(\\d+?)\\scall\\sInitClient\\s\"\\*\"\\s\"(.+?)\",\"(.+?)\",\"(.+?)\",\"(.+?)\""),
    NEWMAIL                     ("C\\ssel\\s(\\d+?)\\scall\\sNewMail\\s\"\\*\"\\s\"(.+?)\""),
    GETTYCOONCOOKIE             ("C\\s(\\d+?)\\ssel\\s(\\d+?)\\scall\\sGetTycoonCookie\\s\"\\^\"\\s\"(.+?)\",\"(.+?)\""),
    PICKEVENT                   ("C\\s(\\d+?)\\ssel\\s(\\d+?)\\scall\\sPickEvent\\s\"\\^\"\\s\"(.+?)\""),
    CLIENTAWARE                 ("C\\ssel\\s(\\d+?)\\scall"),
    CHATMSG                     ("C\\ssel\\s(\\d+?)\\scall\\sChatMsg\\s\"\\*\"\\s\"(.+?)\",\"(.+?)\""),
    MSGCOMPOSITIONCHANGED       ("C\\ssel\\s(\\d+?)\\scall\\sMsgCompositionChanged\\s\"\\*\"\\s\"(.+?)\""),
    NOTIFYMSGCOMPOSITIONSTATE   ("C\\ssel\\s(\\d+?)\\scall\\sNotifyMsgCompositionState\\s\"\\*\"\\s\"(.+?)\",\"(.+?)\""),
    ENABLEEVENTS                ("C\\s(\\d+?)\\ssel\\s(\\d+?)\\sset\\sEnableEvents=\"(.+?)\"");

    private final String parameterPattern;

    ParameterPattern(String parameterPattern) {
        this.parameterPattern = parameterPattern;
    }

    public String getCommand() {
        return this.parameterPattern;
    }
}
