package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class ShowNotification extends Command {

    protected int objectId;
    protected int param1;
    protected String param2;
    protected String notificationUrl;
    protected int param4;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.SHOWNOTIFICATION;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.objectId = Integer.parseInt(this.parameters.get(0));
        this.param1 = Integer.parseInt(this.parameters.get(1));
        this.param2 = this.parameters.get(2);
        this.notificationUrl = this.parameters.get(3);
        this.param4 = Integer.parseInt(this.parameters.get(4));

        // do whats needed

        return null;
    }

    @Override
    public String getResponse() {
        return null;
    }

    /**
     * C sel 37839680 call ShowNotification "*" "#1","%","%http://willow.starpeaceonline.com/Five//0/Visual/Voyager/NewTycoon/Tasks/Tutorial/0/default.asp?Tycoon=dodgerid&WorldName=Chipango","#4";
     */
}
