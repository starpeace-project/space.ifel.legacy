package space.ifel.legacy.utilities;

import space.ifel.legacy.enums.Command;
import space.ifel.legacy.enums.CommandClasses;

public class CommandHandler {
    CommandHandler(String commandString) {
        for (Command command : Command.values()) {
            if (commandString.contains(command.toString())) {
                Command theCommand = command;
            }
        }
    }
}
