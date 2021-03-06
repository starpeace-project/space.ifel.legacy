package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class RdoEndSession extends Command {

    protected int callNumber;
    protected int sessionId;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.RDOENDSESSION;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.sessionId = Integer.parseInt(this.parameters.get(1));
        // Kill the session

        return this;
    }

    @Override
    public String getResponse() {
        return "A" + this.callNumber + " ;";
    }
}
