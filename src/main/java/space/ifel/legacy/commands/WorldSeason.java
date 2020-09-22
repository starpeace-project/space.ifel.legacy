package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class WorldSeason extends Command {

    protected int callNumber;
    protected int objectId;
    protected int worldSeason;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.WORLDSEASON;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.objectId = Integer.parseInt(this.parameters.get(1));

        this.worldSeason = 3; // Get the season of the world

        return this;
    }

    @Override
    public String getResponse() {
        return "A" + this.callNumber + " WorldSeason=\"#" + this.worldSeason + "\";";
    }

    /**
     * C 30 sel 31287108 get WorldSeason;
     */

    /**
     * A30 WorldSeason="#3";
     */
}
