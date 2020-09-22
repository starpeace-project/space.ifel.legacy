package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class Logon extends Command {

    protected int callNumber;
    protected int objectId;
    protected String userName;
    protected String password;
    protected int sessionId;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.LOGON;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.objectId = Integer.parseInt(this.parameters.get(1));
        this.userName = this.parameters.get(2);
        this.password = this.parameters.get(3);

        this.sessionId = 23242349; // Get new session for this server

        return this;
    }

    @Override
    public String getResponse() {
        return "A" + this.callNumber + " res=\"#" + this.sessionId + "\";";
    }

    /**
     * C 32 sel 31287108 call Logon "^" "%dodgerid","%NAHMATE";
     */

    /**
     * A32 res="#31600636";
     */
}
