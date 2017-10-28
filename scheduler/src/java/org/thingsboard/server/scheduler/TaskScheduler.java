package java.org.thingsboard.server.scheduler;

import java.util.UUID;


public interface TaskScheduler {

    public UUID createTask(SchedulingTask task);

    public void cancelTask(UUID taskId);

    public void loadState();

    public void recoverLatestState();
}
