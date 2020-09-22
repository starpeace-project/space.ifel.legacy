package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class SetViewedArea extends Command {

    protected int sessionId;
    protected int x;
    protected int y;
    protected int envelopeX;
    protected int envelopeY;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.SETVIEWEDAREA;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.sessionId = Integer.parseInt(this.parameters.get(0));
        this.x = Integer.parseInt(this.parameters.get(1));
        this.y = Integer.parseInt(this.parameters.get(2));
        this.envelopeX = Integer.parseInt(this.parameters.get(3));
        this.envelopeY = Integer.parseInt(this.parameters.get(4));

        // Set the area being viewed;

        return this;
    }

    @Override
    public String getResponse() {
        return null;
    }

    /**
     * C sel 31600636 call SetViewedArea "*" "#622","#770","#35","#35";
     */
}
