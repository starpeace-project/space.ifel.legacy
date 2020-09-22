package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class WorldXSize extends Command {

    protected int callNumber;
    protected int objectId;
    protected int worldXSize;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.WORLDXSIZE;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.objectId = Integer.parseInt(this.parameters.get(1));

        this.worldXSize = 1000; // Get the width of the world


        return this;
    }

    @Override
    public String getResponse() {
        return "A" + this.callNumber + " WorldXSize=\"#" + this.worldXSize + "\";";
    }

    /**
     * C 28 sel 31287108 get WorldXSize;
     */

    /**
     * A28 WorldXSize="#1000";
     */
}
