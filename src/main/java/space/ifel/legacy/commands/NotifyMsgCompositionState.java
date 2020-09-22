package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class NotifyMsgCompositionState extends Command {

    protected int objectId;
    protected String userName;
    protected int param1;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.NOTIFYMSGCOMPOSITIONSTATE;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.objectId = Integer.parseInt(this.parameters.get(0));
        this.userName = this.parameters.get(1);
        this.param1 = Integer.parseInt(this.parameters.get(2));

        // Do whatever..

        return this;
    }

    @Override
    public String getResponse() {
        return null;
    }

    /**
     * C sel 37839680 call NotifyMsgCompositionState "*" "%dodgerid","#0";
     */
}
