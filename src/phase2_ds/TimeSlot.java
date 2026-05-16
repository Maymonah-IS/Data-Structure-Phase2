package phase2_ds;

//Represents a time interval using a start and end date/time.
// Intervals are considered half-open: [start, end)
public class TimeSlot implements ITimeSlot {

    IDateTime startTime;
    IDateTime endTime;

    public TimeSlot(IDateTime start, IDateTime end) {
        this.startTime = start;
        this.endTime = end;
    }

    /**
     * Returns interval start time.
     */
    @Override
    public IDateTime getStart() {
        return startTime;
    }

    /**
     * Returns interval end time.
     */
    @Override
    public IDateTime getEnd() {
        return endTime;
    }

    /*
     * return 0  -> overlapping intervals
     * return -1 -> this interval ends before the other starts
     * return 1  -> this interval starts after the other ends
     */
    @Override
    public int compareTo(ITimeSlot other) {

        if (this.endTime.compareTo(other.getStart()) <= 0) {
            return -1;
        } else if (this.startTime.compareTo(other.getEnd()) >= 0) {
            return 1;
        }

        return 0;
    }
}
