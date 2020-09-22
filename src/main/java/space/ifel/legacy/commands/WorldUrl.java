package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class WorldUrl extends Command {

    protected int callNumber;
    protected int objectId;
    protected String worldUrl;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.WORLDURL;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.objectId = Integer.parseInt(this.parameters.get(1));

        this.worldUrl = ""; // Get the world url


        return this;
    }

    @Override
    public String getResponse() {
        return "A" + this.callNumber + "WorldURL=\"$" + this.worldUrl + "\";";
    }

    /**
     * Example request
     *
     * C 23 sel 31287108 get WorldURL;
     */

    /**
     * Example reply
     *
     * A23 WorldURL="$http://willow.starpeaceonline.com/Five/";
     */
}
