package space.ifel.legacy.protocols;

public enum Directory {
    DIR_NOERROR_StillTrial         (-1),
    DIR_NOERROR                    (0),
    DIR_ERROR_Unknown              (1),
    DIR_ERROR_AccountAlreadyExists (2),
    DIR_ERROR_UnexistingAccount    (3),
    DIR_ERROR_SerialMaxed          (4),
    DIR_ERROR_InvalidSerial        (5),
    DIR_ERROR_InvalidAlias         (6),
    DIR_ERROR_InvalidPassword      (7),
    DIR_ERROR_AccountBlocked       (8),
    DIR_ERROR_TrialExpired         (9);

    private final int levelCode;

    Directory(int levelCode) {
        this.levelCode = levelCode;
    }

    public int getLevelCode() {
        return this.levelCode;
    }
}
