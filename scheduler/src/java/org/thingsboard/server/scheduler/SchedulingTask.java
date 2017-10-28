package java.org.thingsboard.server.scheduler;



public abstract class SchedulingTask  {
    private RepeatStrategy repeatStrategy;
    private TaskFailoverStrategy failOverStrategy;
    private String taskTypeName;
}
