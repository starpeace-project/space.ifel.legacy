package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class ServerBusy extends Command {

    protected int callNumber;
    protected int sessionId;
    protected int serverResponse;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.SERVERBUSY;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.sessionId = Integer.parseInt(this.parameters.get(1));

        this.serverResponse = 0; // Get server response

        return this;
    }

    @Override
    public String getResponse() {
        return "A" + this.callNumber + " ServerBusy=\"#" + this.serverResponse + "\";";
    }

    /**
     * C 42 sel 31600636 get ServerBusy;
     */

    /**
     * A42 ServerBusy="#0";
     */
}
