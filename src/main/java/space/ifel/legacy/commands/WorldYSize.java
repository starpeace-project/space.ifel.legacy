package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class WorldYSize extends Command {

    protected int callNumber;
    protected int objectId;
    protected int worldYSize;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.WORLDYSIZE;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.objectId = Integer.parseInt(this.parameters.get(1));

        this.worldYSize = 1000; // Get the width of the world


        return this;
    }

    @Override
    public String getResponse() {
        return "A" + this.callNumber + " WorldYSize=\"#" + this.worldYSize + "\";";
    }

    /**
     * C 28 sel 31287108 get WorldYSize;
     */

    /**
     * A28 WorldYSize="#1000";
     */
}
