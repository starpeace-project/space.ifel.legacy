package space.ifel.legacy.commands;

import space.ifel.legacy.abstracts.Command;
import space.ifel.legacy.enums.ParameterPattern;

public class SegmentsInArea extends Command {

    protected int callNumber;
    protected int sessionId;
    protected int param1; // Find meaning - viewing angle poss?
    protected int x1;
    protected int y1;
    protected int x2;
    protected int y2;
    protected String segmentsInArea;

    @Override
    protected ParameterPattern getPattern() {
        return ParameterPattern.SEGMENTSINAREA;
    }

    @Override
    public space.ifel.legacy.interfaces.Command buildMeaning() {
        this.callNumber = Integer.parseInt(this.parameters.get(0));
        this.sessionId = Integer.parseInt(this.parameters.get(1));
        this.param1 = Integer.parseInt(this.parameters.get(2));
        this.x1 = Integer.parseInt(this.parameters.get(3));
        this.y1 = Integer.parseInt(this.parameters.get(4));
        this.x2 = Integer.parseInt(this.parameters.get(5));
        this.y2 = Integer.parseInt(this.parameters.get(6));

        this.segmentsInArea = "segments in area"; // Get the segments in the area asked for

        return this;
    }

    @Override
    public String getResponse() {
        return "A" + this.callNumber + " red=\"%" + this.segmentsInArea + "\";";
    }

    /**
     * C 51 sel 31600636 call SegmentsInArea "^" "#1","#639","#767","#705","#833";
     */

    /**
     * A51 res="%639
     * 783
     * 639
     * 786
     * 35
     * 36
     * 0
     * 0
     * 0
     * 0
     * 639
     * 786
     * 645
     * 786
     * 36
     * 60
     * 0
     * 0
     * 0
     * 0
     * 639
     * 786
     * 639
     * 794
     * 36
     * 36
     * 0
     * 0
     * 0
     * 0
     * 639
     * 651
     * 639
     * 783
     * -54
     * 35
     * 7
     * 0
     * 0
     * 0
     * 645
     * 786
     * 673
     * 786
     * 60
     * 90
     * 0
     * -1
     * 0
     * 0
     * 673
     * 782
     * 673
     * 785
     * 86
     * 87
     * -1
     * -1
     * 0
     * 0
     * 673
     * 786
     * 673
     * 849
     * 90
     * 76
     * -1
     * -2
     * 0
     * 0
     * 673
     * 785
     * 673
     * 786
     * 87
     * 90
     * -1
     * -1
     * 0
     * 0
     * 673
     * 782
     * 743
     * 782
     * 86
     * 99
     * -1
     * -1
     * 0
     * 0
     * 697
     * 791
     * 719
     * 791
     * 110
     * 122
     * -2
     * -2
     * 0
     * 0
     * 673
     * 785
     * 676
     * 785
     * 87
     * 88
     * -1
     * -1
     * 0
     * 0
     * 676
     * 785
     * 740
     * 785
     * 88
     * 101
     * -1
     * -1
     * 0
     * 0
     * 676
     * 785
     * 676
     * 791
     * 88
     * 96
     * -1
     * -2
     * 0
     * 0
     * 676
     * 791
     * 676
     * 843
     * 96
     * 81
     * -2
     * -3
     * 0
     * 0
     * 676
     * 791
     * 682
     * 791
     * 96
     * 100
     * -2
     * -2
     * 0
     * 0
     * 682
     * 791
     * 682
     * 806
     * 100
     * 103
     * -2
     * -6
     * 0
     * 0
     * 682
     * 791
     * 697
     * 791
     * 100
     * 110
     * -2
     * -2
     * 0
     * 0
     * 697
     * 791
     * 697
     * 806
     * 110
     * 114
     * -2
     * -6
     * 0
     * 0
     * 697
     * 828
     * 719
     * 828
     * 101
     * 112
     * -5
     * -6
     * 0
     * 0
     * 697
     * 806
     * 719
     * 806
     * 114
     * 126
     * -6
     * -8
     * 0
     * 0
     * 697
     * 806
     * 697
     * 828
     * 114
     * 101
     * -6
     * -5
     * 0
     * 0
     * 682
     * 806
     * 697
     * 806
     * 103
     * 114
     * -6
     * -6
     * 0
     * 0
     * 697
     * 828
     * 697
     * 843
     * 101
     * 93
     * -5
     * -4
     * 0
     * 0
     * 682
     * 828
     * 697
     * 828
     * 92
     * 101
     * -4
     * -5
     * 0
     * 0
     * 682
     * 828
     * 682
     * 843
     * 92
     * 84
     * -4
     * -3
     * 0
     * 0
     * 682
     * 806
     * 682
     * 828
     * 103
     * 92
     * -6
     * -4
     * 0
     * 0
     * 594
     * 786
     * 639
     * 786
     * 85
     * 36
     * 0
     * 0
     * 0
     * 0
     * ";
     */
}
