package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class RdoOpenSession extends Command {

    protected int callNumber;
    protected int objectId;
    protected int sessionId;

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.objectId = Integer.parseInt(this.parameters.get(1));
        this.sessionId = Integer.parseInt("987987987");

        return this;
    }

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.RDOOPENSESSION;
    }

    @Override
    public String getResponse() {
        // Get session id from somewhere...

        return "A" + this.callNumber + " RDOOpensession=#\"" + this.sessionId + "\";";
    }
}
