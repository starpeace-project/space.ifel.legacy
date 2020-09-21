package space.ifel.legacy.enums;

public enum Command {
    IDOF                        ("idof"),
    RDOOPENSESSION              ("RDOOpenSession"),
    RDOMAPSEGAUSER              ("RDOMapSegaUser"),
    RDOLOGONUSER                ("RDOLogonUser"),
    RDOENDSESSION               ("RDOEndSession"),
    RDOQUERYKEY                 ("RDOQueryKey"),
    WORLDNAME                   ("WorldName"),
    DAADDR                      ("DAAddr"),
    DALOCKPORT                  ("DALockPort"),
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
    RDOCNNTID                   ("RDOCnntId"),
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


    private final String command;

    Command(String command) {
        this.command = command;
    }

    public String getCommand() {
        return this.command;
    }
}
