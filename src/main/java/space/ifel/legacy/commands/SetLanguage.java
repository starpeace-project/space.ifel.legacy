package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class SetLanguage extends Command {

    protected int sessionId;
    protected int languageId;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.SETLANGUAGE;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.sessionId = Integer.parseInt(this.parameters.get(0));
        this.languageId = Integer.parseInt(this.parameters.get(1));

        //Set the language

        return this;
    }

    @Override
    public String getResponse() {
        return null;
    }

    /**
     * C sel 31600636 call SetLanguage "*" "%0";
     */

    /**
     * One way, no reply seen.
     */
}
