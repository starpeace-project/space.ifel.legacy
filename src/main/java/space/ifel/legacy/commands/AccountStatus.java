package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class AccountStatus extends Command {

    protected int callNumber;
    protected int objectId;
    protected String userName;
    protected String password;
    protected int accountStatus;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.ACCOUNTSTATUS;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.objectId = Integer.parseInt(this.parameters.get(1));
        this.userName = this.parameters.get(2);
        this.password = this.parameters.get(3);

        this.accountStatus = 2; // Get the season of the world

        return this;
    }

    @Override
    public String getResponse() {
        return "A" + this.callNumber + " res=\"#" + this.accountStatus + "\";";
    }

    /**
     * C 31 sel 31287108 call AccountStatus "^" "%dodgerid","%NAHMATE";
     */

    /**
     * A31 res="#2";
     */
}
