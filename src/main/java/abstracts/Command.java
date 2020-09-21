package abstracts;

import enums.ParameterPattern;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Command implements interfaces.Command {

    protected String commandBody;
    protected ArrayList<String> parameters;

    @Override
    public interfaces.Command Command(String commandBody) {
        this.commandBody = commandBody;
        ProcessPattern();
        return this;
    }

    public abstract void Process();

    protected abstract ParameterPattern GetPattern();

    @Override
    public abstract String GetResponse();

    protected void ProcessPattern() {
        String regex = GetPattern().toString();
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE | Pattern.DOTALL);
        Matcher matcher = pattern.matcher(this.commandBody);

        while (matcher.find()) {
            for (int i = 1; i <= matcher.groupCount(); i++) {
                this.parameters.add(matcher.group(i));
            }
        }
    }
}
