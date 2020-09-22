package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class DaAddr extends Command {

    protected int callNumber;
    protected int objectId;
    protected String daAddr;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.DAADDR;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.objectId = Integer.parseInt(this.parameters.get(1));

        this.daAddr = ""; // Get the daaddr (direct access address (ip) (Model Server))


        return this;
    }

    @Override
    public String getResponse() {
        return "A" + this.callNumber + " DAAddr=\"$" + this.daAddr + "\"";
    }

    /**
     * C 24 sel 31287108 get DAAddr;
     */

    /**
     * A24 DAAddr="$78.46.87.219";
     */
}
