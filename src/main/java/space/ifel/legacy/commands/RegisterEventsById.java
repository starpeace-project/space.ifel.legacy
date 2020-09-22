package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class RegisterEventsById extends Command {

    protected int callNumber;
    protected int sessionId;
    protected int cnntId;
    protected int serverResponse;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.REGISTEREVENTSBYID;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.sessionId = Integer.parseInt(this.parameters.get(1));
        this.cnntId = Integer.parseInt(this.parameters.get(2));

        // Register the cnntid wherever it needs registering
        this.serverResponse = 0; // Response code from server

        return this;
    }

    @Override
    public String getResponse() {
        return "A" + this.callNumber + " res=\"#" + this.serverResponse + "\";";
    }

    /**
     * C 36 sel 31600636 call RegisterEventsById "^" "#31666024";
     */

    /**
     * A36 res="#0";
     */
}
