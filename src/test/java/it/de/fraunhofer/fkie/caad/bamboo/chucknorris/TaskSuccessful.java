package it.de.fraunhofer.fkie.caad.bamboo.chucknorris;

import com.atlassian.bamboo.build.logger.BuildLogger;
import com.atlassian.bamboo.task.*;
import org.jetbrains.annotations.NotNull;

public class TaskSuccessful implements TaskType {
    @NotNull
    @Override
    public TaskResult execute(@NotNull TaskContext taskContext) throws TaskException {
        final BuildLogger buildLogger = taskContext.getBuildLogger();

        buildLogger.addBuildLogEntry("Hello, World! Successful!");

        return TaskResultBuilder.newBuilder(taskContext).success().build();
    }
}
