package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class ObjectsInArea extends Command {

    protected int callNumber;
    protected int sessionId;
    protected int x;
    protected int y;
    protected int envelopeX;
    protected int envelopeY;
    protected String objectsInArea;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.OBJECTSINAREA;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.sessionId = Integer.parseInt(this.parameters.get(1));
        this.x = Integer.parseInt(this.parameters.get(2));
        this.y = Integer.parseInt(this.parameters.get(3));
        this.envelopeX = Integer.parseInt(this.parameters.get(4));
        this.envelopeY = Integer.parseInt(this.parameters.get(5));

        this.objectsInArea = ""; // Get the objects in that area.

        return this;
    }

    @Override
    public String getResponse() {
        return "A" + this.callNumber + " res=\"%" + this.objectsInArea + "\";";
    }

    /**
     * C 50 sel 31600636 call ObjectsInArea "^" "#640","#768","#64","#64";
     */

    /**
     * A50 res="%4692 // Bulding class id
     * 30 // unsure
     * 17 // unsure
     * 640 // x
     * 779 // y
     * 4702
     * 30
     * 17
     * 640
     * 781
     * 3510
     * 0
     * 16
     * 640
     * 783
     * 3500
     * 18
     * 16
     * 640
     * 787
     * 2852
     * 18
     * 17
     * 683
     * 807
     * 2852
     * 18
     * 17
     * 690
     * 807
     * 2852
     * 18
     * 17
     * 698
     * 829";
     */
}
