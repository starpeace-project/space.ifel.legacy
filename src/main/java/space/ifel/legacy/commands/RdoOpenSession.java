package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class RdoOpenSession extends Command {

    protected int callNumber;
    protected int objectId;

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.objectId = Integer.parseInt(this.parameters.get(1));

        return this;
    }

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.RDOOPENSESSION;
    }

    @Override
    public String getResponse() {
        // Get session id from somewhere...

        return "A " + this.callNumber + " RDOOpensession=\"@todo Session id here\";";
    }
}
