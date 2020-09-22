package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class MsgCompositionChanged extends Command {

    protected int sessionId;
    protected int compositionId;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.MSGCOMPOSITIONCHANGED;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.sessionId = Integer.parseInt(this.parameters.get(0));
        this.compositionId = Integer.parseInt(this.parameters.get(1));

        return this;
    }

    @Override
    public String getResponse() {
        return null;
    }

    /**
     * C sel 31600636 call MsgCompositionChanged "*" "#0";
     */
}
