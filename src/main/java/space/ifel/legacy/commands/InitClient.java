package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class InitClient extends Command {

    protected int objectId;
    protected int param1; // Find meaning
    protected int param2; // Find meaning
    protected int param3; // Find meaning
    protected int param4; // Find meaning

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.INITCLIENT;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.objectId = Integer.parseInt(this.parameters.get(0));
        this.param1 = Integer.parseInt(this.parameters.get(1));
        this.param2 = Integer.parseInt(this.parameters.get(2));
        this.param3 = Integer.parseInt(this.parameters.get(3));
        this.param4 = Integer.parseInt(this.parameters.get(4));


        return this;
    }

    @Override
    public String getResponse() {
        return null;
    }

    /**
     * C sel 37839680 call InitClient "*" "@114872","%100000000","#0","#116533876";
     */
}
