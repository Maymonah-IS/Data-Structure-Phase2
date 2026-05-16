/**
 * Represents a time interval defined by a start and an end date-time.
 * Intervals are treated as half-open: [start, end), and compared as follows:
 * - return 0 if the intervals overlap
 * - return -1 if this interval ends before the other starts
 * - return +1 if this interval starts after the other ends
 */
public interface ITimeSlot extends Comparable<ITimeSlot> {

    /**
     * Returns the start of the interval.
     */
    IDateTime getStart();

    /**
     * Returns the end of the interval.
     */
    IDateTime getEnd();
}