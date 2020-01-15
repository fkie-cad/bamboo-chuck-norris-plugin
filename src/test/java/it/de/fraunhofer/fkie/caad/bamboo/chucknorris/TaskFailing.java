package it.de.fraunhofer.fkie.caad.bamboo.chucknorris;

import com.atlassian.bamboo.build.logger.BuildLogger;
import com.atlassian.bamboo.task.*;
import org.jetbrains.annotations.NotNull;

public class TaskFailing implements TaskType {
    @NotNull
    @Override
    public TaskResult execute(@NotNull TaskContext taskContext) throws TaskException {
        final BuildLogger buildLogger = taskContext.getBuildLogger();

        buildLogger.addBuildLogEntry("Hello, World! Failing!");

        return TaskResultBuilder.newBuilder(taskContext).failed().build();
    }
}
