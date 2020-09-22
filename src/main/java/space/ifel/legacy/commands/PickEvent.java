package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class PickEvent extends Command {

    protected int callNumber;
    protected int sessionId;
    protected int tycoonId;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.PICKEVENT;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.sessionId = Integer.parseInt(this.parameters.get(1));
        this.tycoonId = Integer.parseInt(this.parameters.get(2));

        return this;
    }

    @Override
    public String getResponse() {
        return "A" + this.callNumber + " res=\"%\";";
    }

    /**
     * C 41 sel 31600636 call PickEvent "^" "#35";
     */

    /**
     * A41 res="%";
     */
}
