package space.ifel.legacy.utilities;

import space.ifel.legacy.enums.Command;
import space.ifel.legacy.enums.CommandClasses;

/**
 * Important to note the to use this, it is best to extend it and
 * Override getClass to provide an injected class from a container
 * to prevent having to instantiate classes on every request.
 */
public class CommandHandler {

    protected String getClassName(String commandString) {
        for (Command command : Command.values()) {
            if (commandString.contains(command.getCommand())) {
                String className = CommandClasses.valueOf(command.toString()).getCommandClass();
                return "space.ifel.legacy.commands." + className;
            }
        }

        return null;
    }

    protected space.ifel.legacy.interfaces.Command getClass(String className) {
        try {
            ClassLoader classLoader = CommandHandler.class.getClassLoader();
            Class<? extends space.ifel.legacy.interfaces.Command> cmnd =
                    (Class<? extends space.ifel.legacy.interfaces.Command>) classLoader.loadClass(className);
            return cmnd.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public String getResponse(String commandBody) {
        String className = getClassName(commandBody);
        space.ifel.legacy.interfaces.Command commandClass = getClass(className);
        if (commandClass != null) {
            return commandClass.process(commandBody).buildMeaning().getResponse();
        }

        return null;
    }
}
