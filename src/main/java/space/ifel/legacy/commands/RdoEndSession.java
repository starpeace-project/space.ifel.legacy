package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class RdoEndSession extends Command {

    protected int callNumber;
    protected int sessionId;

    @Override
    protected ParameterPattern getPattern() {
        return null;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        return null;
    }

    @Override
    public String getResponse() {
        return "A" + this.callNumber + " ;";
    }
}
