package space.ifel.legacy.utilities;

import junit.framework.TestCase;
import static org.hamcrest.CoreMatchers.instanceOf;
import space.ifel.legacy.commands.RdoOpenSession;

import static org.junit.Assert.assertThat;

public class CommandHandlerTest extends TestCase {
    public void testGetClassName()
    {
        CommandHandler cmd = new CommandHandler();
        assertEquals("space.ifel.legacy.commands.RdoOpenSession", cmd.getClassName("C 1 sel 39685688 get RDOOpenSession;"));
    }

    public void testGetClass()
    {
        CommandHandler cmd = new CommandHandler();
        String className = cmd.getClassName("C 1 sel 39685688 get RDOOpenSession;");
        assertNotNull(cmd.getClass(className));
        assertThat(cmd.getClass(className), instanceOf(RdoOpenSession.class));
    }

    public void testResponse()
    {
        CommandHandler cmd = new CommandHandler();
        assertEquals("A 1 RDOOpensession=\"@todo Session id here\";", cmd.getResponse("C 1 sel 39685688 get RDOOpenSession;"));
    }
}