package commands;

import abstracts.Command;
import enums.ParameterPattern;

public class RdoOpenSession extends Command {
    @Override
    public void Process() {

    }

    @Override
    protected ParameterPattern GetPattern() {
        return ParameterPattern.RDOOPENSESSION;
    }

    @Override
    public String GetResponse() {
        return null;
    }
}
