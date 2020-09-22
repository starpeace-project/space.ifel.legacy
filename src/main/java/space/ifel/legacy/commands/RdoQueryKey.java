package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class RdoQueryKey extends Command {

    protected int callNumber;
    protected int sessionId;
    protected String keyPath;
    protected String subKeyPaths;


    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.RDOQUERYKEY;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.sessionId = Integer.parseInt(this.parameters.get(1));
        this.keyPath = this.parameters.get(2);
        this.subKeyPaths = this.parameters.get(3);


        return this;
    }

    @Override
    public String getResponse() {
        String reply = "";
        return "A" + this.callNumber + " res=\"%" + reply + "\";";
    }

    /**
     * Example request
     *
     * C 9 sel 165268780 call RDOQueryKey "^" "%Root/Areas/America/Worlds","%General/Population
     * General/Investors
     * General/Online
     * General/Date
     * Interface/IP
     * Interface/Port
     * Interface/URL
     * Interface/Running
     * ";
     */

    /**
     * Example reply
     *
     * A9 res="%Count=1
     * Key0=zorcon
     * general/date0=2016
     * general/investors0=18
     * general/online0=3
     * general/population0=5997885
     * interface/ip0=zorcon.starpeaceonline.com
     * interface/port0=8000
     * interface/running0=true
     * interface/url0=http://zorcon.starpeaceonline.com/Five/
     * ";
     */
}
