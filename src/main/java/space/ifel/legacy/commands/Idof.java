package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class Idof extends Command {

    protected int callNumber;
    protected String serverType;
    protected String objectId;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.IDOF;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.serverType = this.parameters.get(1);
        this.objectId = "12345678";

        return this;
    }

    @Override
    public String getResponse() {
        // Get objid from somewhere

        return "A" + " objid=\"" + this.objectId + "\";";
    }
}
