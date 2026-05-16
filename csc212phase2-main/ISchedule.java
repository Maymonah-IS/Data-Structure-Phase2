/**
 * A schedule storing non-conflicting events identified by their IDs and time slots.
 */
public interface ISchedule {


    /**
     * Returns the number of events in the schedule.
     */
    int size();

    /**
     * Returns true if the schedule is empty.
     * Must run in O(1).
     */
    boolean empty();

    /**
     * Removes all events from the schedule.
     */
    void clear();

    /**
     * Inserts a new event into the schedule.
     *
     * Insertion fails if:
     * - the event ID already exists in the schedule, or
     * - the time slot conflicts with an existing event.
     *
     * @param eventId  the event ID to insert
     * @param timeSlot the time slot of the event
     * @return true if inserted, false otherwise
     *
     * Must run in O(log n) on average.
     */
    boolean add(int eventId, ITimeSlot timeSlot);

    /**
     * Removes the given event ID if it exists.
     *
     * @param eventId the event ID to remove
     * @return true if removed, false otherwise
     *
     * Must run in O(log n) on average.
     */
    boolean remove(int eventId);

    /**
     * Checks whether the given event ID exists in the schedule.
     *
     * @param eventId the event ID to search for
     * @return true if the event ID exists, false otherwise
     *
     * Must run in O(log n) on average.
     */
    boolean contains(int eventId);

    /**
     * Checks whether the given time slot conflicts with an existing event.
     *
     * @param timeSlot the time slot to test
     * @return true if a conflict exists, false otherwise
     *
     * Must run in O(log n) on average.
     */
    boolean conflicts(ITimeSlot timeSlot);

    /**
     * Returns all event IDs stored in the schedule.
     *
     * @return the set of event IDs
     */
    Set<Integer> getEventIds();

    /**
     * Returns all scheduled events indexed by their time slots.
     *
     * @return a map from time slots to event IDs
     */
    Map<ITimeSlot, Integer> getEvents();
}