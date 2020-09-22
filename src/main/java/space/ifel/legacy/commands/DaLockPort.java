package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class DaLockPort extends Command {

    protected int callNumber;
    protected int objectId;
    protected String daLockPort;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.DALOCKPORT;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.objectId = Integer.parseInt(this.parameters.get(1));

        this.daLockPort = ""; // Get the daLockPort (direct access port (Model Server))


        return this;
    }

    @Override
    public String getResponse() {
        return "A" + this.callNumber + " DALockPort=\"#" + this.daLockPort + "\"";
    }

    /**
     * C 25 sel 31287108 get DALockPort;
     */

    /**
     * A25 DALockPort="#7001";
     */
}
