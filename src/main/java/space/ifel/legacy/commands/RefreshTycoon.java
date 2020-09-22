package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class RefreshTycoon extends Command {

    protected int objectId;
    protected String money;
    protected String param1;
    protected int param2;
    protected int param3;
    protected int param4;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.REFRESHTYCOON;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.objectId = Integer.parseInt(this.parameters.get(0));
        this.money = this.parameters.get(1);
        this.param1 = this.parameters.get(2);
        this.param2 = Integer.parseInt(this.parameters.get(3));
        this.param3 = Integer.parseInt(this.parameters.get(4));
        this.param4 = Integer.parseInt(this.parameters.get(5));

        // do what needs to be done

        return this;
    }

    @Override
    public String getResponse() {
        return null;
    }

    /**
     * C sel 37839680 call RefreshTycoon "*" "%100000000","%0","#0","#0","#50";
     */
}
