package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class ChatMsg extends Command {

    protected int objectId;
    protected String channel;
    protected String message;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.CHATMSG;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.objectId = Integer.parseInt(this.parameters.get(0));
        this.channel = this.parameters.get(1);
        this.message = this.parameters.get(3);

        // Do sending message

        return this;
    }

    @Override
    public String getResponse() {
        return null;
    }

    /**
     * C sel 37839680 call ChatMsg "*" "%SYSTEM","%dodgerid has entered Chipango";
     */

    /**
     *
     */
}
