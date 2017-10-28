package java.org.thingsboard.server.scheduler;

import scala.org.thingsboard.server.scheduler.TaskFailOverStrategy;

import java.util.UUID;


public interface TaskManager {

        public UUID createSchedulingTask(RepeatStrategy repeatStrategy,
                                         TaskFailOverStrategy failOverStrategy,
                                         String taskTypeName);


        public void cancelTask(UUID taskId);

        public void updateTask(UUID taskId);
}

