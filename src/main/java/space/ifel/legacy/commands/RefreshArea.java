package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class RefreshArea extends Command {

    protected int objectId;
    protected int x;
    protected int y;
    protected int param1;
    protected int param2;
    protected String param3
            ;
    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.REFRESHAREA;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.objectId = Integer.parseInt(this.parameters.get(0));
        this.x = Integer.parseInt(this.parameters.get(1));
        this.y = Integer.parseInt(this.parameters.get(2));
        this.param1 = Integer.parseInt(this.parameters.get(3));
        this.param2 = Integer.parseInt(this.parameters.get(4));
        this.param3 = this.parameters.get(5);

        // Do whats needed.

        return null;
    }

    @Override
    public String getResponse() {
        return null;
    }

    /**
     * C sel 37839680 call RefreshArea "*" "#635","#787","#4","#4","%1:6031
     * 0
     * 16
     * 635
     * 787:639
     * 786
     * 639
     * 794
     * 36
     * 36
     * 0
     * 0
     * 0
     * 0
     * :";
     */
}
