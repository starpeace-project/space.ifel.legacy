package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class MailAddr extends Command {

    protected int callNumber;
    protected int objectId;
    protected String mailAddr;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.MAILADDR;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.objectId = Integer.parseInt(this.parameters.get(1));

        this.mailAddr = ""; // Get the ip address of mail server


        return this;
    }

    @Override
    public String getResponse() {
        return "A" + this.callNumber + " MailAddr=\"$" + this.mailAddr + "\";";
    }

    /**
     * C 26 sel 31287108 get MailAddr;
     */

    /**
     * A26 MailAddr="$78.46.87.219";
     */
}
