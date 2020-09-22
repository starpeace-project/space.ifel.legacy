package space.ifel.legacy.commands;

import junit.framework.TestCase;
import space.ifel.legacy.utilities.CommandHandler;

public class RdoOpenSessionTest extends TestCase {
    public void testCommand() {
        System.out.println("Processing: " + "C 1 sel 39685688 get RDOOpenSession;\n");
        String reply = new CommandHandler().getResponse("C 13 sel 39685688 get RDOOpenSession;");
        System.out.println("Reply: " + reply + "\n");
    }
}