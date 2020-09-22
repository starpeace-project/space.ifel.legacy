package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class MailPort extends Command {

    protected int callNumber;
    protected int objectId;
    protected String mailPort;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.MAILPORT;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.objectId = Integer.parseInt(this.parameters.get(1));

        this.mailPort = ""; // Get the port address of mail server


        return this;
    }

    @Override
    public String getResponse() {
        return "A" + this.callNumber + " MailPort=\"#" + this.mailPort + "\";";
    }

    /**
     * C 27 sel 31287108 get MailPort;
     */

    /**
     * A27 MailPort="#10000";
     */
}
