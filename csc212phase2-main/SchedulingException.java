/**
 * Exception thrown when scheduling fails.
 */
public class SchedulingException extends Exception {

    private  ScheduleFailureReason reason;

    public SchedulingException(ScheduleFailureReason reason) {
        this.reason = reason;
    }

    public ScheduleFailureReason getReason() {
        return reason;
    }
}