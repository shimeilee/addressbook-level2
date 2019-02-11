package seedu.addressbook.commands;

import java.util.LinkedList;
import java.util.List;

public class Logger {
    
    /** List of past commands given to the programme. */
    public static List<Command> pastCommands = new LinkedList<>();
    
    public static final String COMMAND_WORD = "log";
    
    public void addCommands(Command command) {
        pastCommands.add(command);
    }
    
    public List<Command> getPastCommands() {
        return pastCommands;
    }
}
