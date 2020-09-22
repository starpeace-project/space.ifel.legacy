package space.ifel.legacy.abstracts;

import space.ifel.legacy.enums.ParameterPattern;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Command implements space.ifel.legacy.interfaces.Command {

    protected String commandBody;
    protected ArrayList<String> parameters = new ArrayList<>();

    public space.ifel.legacy.interfaces.Command process(String commandBody) {
        this.commandBody = commandBody;
        processPattern();
        System.out.println("PROCESSED\n");
        return this;
    }

    protected abstract ParameterPattern getPattern();

    @Override
    public abstract space.ifel.legacy.interfaces.Command buildMeaning();

    @Override
    public abstract String getResponse();

    protected void processPattern() {
        String regex = getPattern().getCommand();
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE | Pattern.DOTALL);
        Matcher matcher = pattern.matcher(this.commandBody);

        while (matcher.find()) {
            for (int i = 1; i <= matcher.groupCount(); i++) {
                this.parameters.add(matcher.group(i));
            }
        }
    }
}
