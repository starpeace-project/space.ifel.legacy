package space.ifel.legacy.enums;

public enum CommandClasses {
    IDOF                        ("Idof"),
    RDOOPENSESSION              ("RdoOpenSession"),
    RDOMAPSEGAUSER              ("RdoMapSegaUser"),
    RDOLOGONUSER                ("RdoLogonUser"),
    RDOENDSESSION               ("RdoEndSession"),
    RDOQUERYKEY                 ("RdoQueryKey"),
    WORLDNAME                   ("WorldName"),
    DAADDR                      ("DaAddr"),
    DALOCKPORT                  ("DaLockPort"),
    MAILADDR                    ("MailAddr"),
    MAILPORT                    ("MailPort"),
    WORLDXSIZE                  ("WorldXSize"),
    WORLDYSIZE                  ("WorldYSize"),
    WORLDSEASON                 ("WorldSeason"),
    ACCOUNTSTATUS               ("AccountStatus"),
    LOGON                       ("Logon"),
    MAILACCOUNT                 ("MailAccount"),
    TYCOONID                    ("TycoonId"),
    SEGMENTSINAREA              ("SegmentsInArea"),
    SHOWNOTIFICATION            ("ShowNotification"),
    REFRESHTYCOON               ("RefreshTycoon"),
    SERVERBUSY                  ("ServerBusy"),
    SETVIEWEDAREA               ("SetViewedArea"),
    OBJECTSINAREA               ("ObjectsInArea"),
    REFRESHAREA                 ("RefreshArea"),
    RDOCNNTID                   ("RdoCnntId"),
    REGISTEREVENTSBYID          ("RegisterEventsById"),
    SETLANGUAGE                 ("SetLanguage"),
    INITCLIENT                  ("InitClient"),
    NEWMAIL                     ("NewMail"),
    GETTYCOONCOOKIE             ("GetTycoonCookie"),
    PICKEVENT                   ("PickEvent"),
    CLIENTAWARE                 ("ClientAware"),
    CHATMSG                     ("ChatMsg"),
    MSGCOMPOSITIONCHANGED       ("MsgCompositionChanged"),
    NOTIFYMSGCOMPOSITIONSTATE   ("NotifyMsgCompositionState");

    private final String commandClass;

    CommandClasses(String commandClass) {
        this.commandClass = commandClass;
    }

    public String getCommandClass() {
        return this.commandClass;
    }
}
