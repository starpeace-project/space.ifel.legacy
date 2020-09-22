package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class NewMail extends Command {

    protected int objectId;
    protected int param1; // Find meaning

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.NEWMAIL;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.objectId = Integer.parseInt(this.parameters.get(0));
        this.param1 = Integer.parseInt(this.parameters.get(1));

        return this;
    }

    @Override
    public String getResponse() {
        return null;
    }

    /**
     * C sel 37839680 call NewMail "*" "#1";
     */
}
