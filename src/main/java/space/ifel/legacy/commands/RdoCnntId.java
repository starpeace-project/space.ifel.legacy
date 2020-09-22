package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class RdoCnntId extends Command {

    protected int callNumber;
    protected int sessionId;
    protected int cnntId;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.RDOCNNTID;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.sessionId = Integer.parseInt(this.parameters.get(1));

        this.cnntId = 3534534; // Get connection id from somewhere (is actually an events id)

        return this;
    }

    @Override
    public String getResponse() {
        return "A" + this.callNumber + " RDOCnntId=\"$" + this.cnntId + "\";";
    }

    /**
     * C 35 sel 31600636 get RDOCnntId;
     */

    /**
     * A35 RDOCnntId="$31666024";
     */
}
