package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class GetTycoonCookie extends Command {

    protected int callNumber;
    protected int sessionId;
    protected int tycoonId;
    protected String cookieKey;
    protected String cookieValue;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.GETTYCOONCOOKIE;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.sessionId = Integer.parseInt(this.parameters.get(1));
        this.tycoonId = Integer.parseInt(this.parameters.get(3));
        this.cookieKey = this.parameters.get(4); // this can just be.

        this.cookieValue = "whatever"; // get cookie value

        return this;
    }

    @Override
    public String getResponse() {
        return "A" + this.callNumber + " res=\"%" + this.cookieValue + "\";";
    }

    /**
     * C 39 sel 31600636 call GetTycoonCookie "^" "#35","%LastX.0";
     */

    /**
     * A39 res="%640";
     */
}
