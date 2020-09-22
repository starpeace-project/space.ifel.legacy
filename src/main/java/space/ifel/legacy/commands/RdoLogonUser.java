package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class RdoLogonUser extends Command {

    protected int callNumber;
    protected int sessionId;
    protected String userName;
    protected String password;
    protected int directoryResponse;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.RDOLOGONUSER;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.sessionId = Integer.parseInt(this.parameters.get(1));
        this.userName = this.parameters.get(2);
        this.password = this.parameters.get(3);

        this.directoryResponse = 0; // Do Login Logic

        return this;
    }

    @Override
    public String getResponse() {
        return "A" + this.callNumber + " res=\"#" + this.directoryResponse + "\";";
    }
}
