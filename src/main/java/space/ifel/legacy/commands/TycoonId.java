package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class TycoonId extends Command {

    protected int callNumber;
    protected int sessionId;
    protected int tycoonId;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.TYCOONID;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.sessionId = Integer.parseInt(this.parameters.get(1));

        this.tycoonId = 35; // Get tycoon id from somewhere

        return this;
    }

    @Override
    public String getResponse() {
        return "A" + this.callNumber + " TycoonId=\"#" + this.tycoonId + "\";";
    }

    /**
     * C 34 sel 31600636 get TycoonId;
     */

    /**
     * A34 TycoonId="#35";
     */
}
