package kidsnd274.duke.command;

import kidsnd274.duke.TaskList;
import kidsnd274.duke.taskobjects.Deadline;

public class AddDeadlineCommand extends AddCommand {
    public static final String COMMAND_WORD = "deadline";

    public AddDeadlineCommand(TaskList taskList, String description, String date) {
        super(taskList, new Deadline(description, date));
    }

    @Override
    public CommandResult runCommand() {
        taskList.add(taskObj);
        String message = String.format("Added %s, as a %s\n%s\nYou currently have %d tasks",
                taskObj, taskObj.getType(), taskObj.getCurrentStatus(), taskList.size());
        return new CommandResult(message, true);
    }
}