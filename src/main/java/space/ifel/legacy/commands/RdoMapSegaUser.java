package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class RdoMapSegaUser extends Command {

    private int callNumber;
    private int sessionId;
    private String userName;
    private boolean successfulLogin;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.RDOMAPSEGAUSER;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.sessionId = Integer.parseInt(this.parameters.get(1));
        this.userName = this.parameters.get(2);

        this.successfulLogin = true; // Fake it, the call isn't real!

        return this;
    }

    @Override
    public String getResponse() {
        String success = this.successfulLogin ? "%" : "#";
        return "A" + this.callNumber + " res=\"" + success + "\";";
    }
}
