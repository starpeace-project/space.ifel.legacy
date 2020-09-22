package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class MailAccount extends Command {

    protected int callNumber;
    protected int sessionId;
    protected String mailAccount;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.MAILACCOUNT;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.sessionId = Integer.parseInt(this.parameters.get(1));

        this.mailAccount = "mailaccount"; // Get new session for this server

        return this;
    }

    @Override
    public String getResponse() {
        return "A" + this.callNumber + " MailAccount=\"$" + this.mailAccount + "\";";
    }

    /**
     * C 33 sel 31600636 get MailAccount;
     */

    /**
     * A33 MailAccount="$dodgerid@Chipango.net";
     */
}

