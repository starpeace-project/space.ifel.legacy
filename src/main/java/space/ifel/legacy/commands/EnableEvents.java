package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class EnableEvents extends Command {

    protected int callNumber;
    protected int sessionId;
    protected int signal;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.ENABLEEVENTS;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.sessionId = Integer.parseInt(this.parameters.get(1));
        this.signal = Integer.parseInt(this.parameters.get(2));

        return this;
    }

    @Override
    public String getResponse() {
        return "A" + this.callNumber + " ;";
    }

    /**
     * C 37 sel 31600636 set EnableEvents="#-1";
     */

    /**
     * A37 ;
     */
}
