package java.org.thingsboard.server.scheduler;


public class ReTryOnFailOverStrategy implements TaskFailoverStrategy {
    private int attempts;
    private long retryInterval;
}
