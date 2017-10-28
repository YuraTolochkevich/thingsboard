package java.org.thingsboard.server.scheduler;


public class ConstantTimeRepeatStrategy implements RepeatStrategy {
    private long startTime;
    private long repeatingInterval;
}
