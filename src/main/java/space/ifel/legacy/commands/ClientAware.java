package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class ClientAware extends Command {

    protected int sessionId;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.CLIENTAWARE;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.sessionId = Integer.parseInt(this.parameters.get(0));

        return this;
    }

    @Override
    public String getResponse() {
        return null;
    }

    /**
     * C sel 31600636 call ClientAware "*" ;
     */

    /**
     *
     */
}
