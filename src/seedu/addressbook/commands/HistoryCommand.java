package seedu.addressbook.commands;

import seedu.addressbook.Main;

import java.util.ArrayList;
import java.util.List;

public class HistoryCommand extends Command {
    
    public static final String COMMAND_WORD = "history";
    
    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Lists the last commands that you have entered in reverse " +
            "chronological order.\n";
    
    public static final String MESSAGE_HISTORY_SUCCESS = "History: %s";
    
    public HistoryCommand() { }
    
    @Override
    public CommandResult execute() {
        final List<Command> history = Main.logger.getPastCommands();
        
        if (history.size() > 0){
            return new CommandResult(String.format(MESSAGE_HISTORY_SUCCESS,
                history.remove(history.size() - 1)));
        }
        return new CommandResult("error");
    }
}
