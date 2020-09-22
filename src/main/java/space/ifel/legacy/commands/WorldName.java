package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

/**
 * The object Id here is the identifier for the Interface Server
 */
public class WorldName extends Command {

    protected int callNumber;
    protected int objectId;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.WORLDNAME;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.objectId = Integer.parseInt(this.parameters.get(1));


        return this;
    }

    @Override
    public String getResponse() {
        return "A" + this.callNumber + " WorldName=\"$\";";
    }

    /**
     * Example request
     *
     * C 22 sel 31287108 get WorldName;
     */

    /**
     * Example reply
     *
     * A22 WorldName="$Chipango";
     */
}
