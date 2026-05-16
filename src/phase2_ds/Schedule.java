package phase2_ds;

public class Schedule implements ISchedule {

    private Map<ITimeSlot, Integer> timesIDs;
    private Map<Integer, ITimeSlot> newIDs;
    private Set<Integer> IDs;

    public Schedule() {
        timesIDs = new BSTMap<ITimeSlot, Integer>();
        newIDs = new BSTMap<Integer, ITimeSlot>();
        IDs = new BSTSet<Integer>();
    }

    @Override
    public int size() {
        return IDs.size();
    }

    @Override
    public boolean empty() {
        return IDs.empty();
    }

    /**
     * Removes all events from the schedule.
     */
    @Override
    public void clear() {
        timesIDs.clear();
        newIDs.clear();
        IDs.clear();

    }

    /**
     * Inserts a new event into the schedule.
     *
     * Insertion fails if: - the event ID already exists in the schedule, or -
     * the time slot conflicts with an existing event.
     *
     * @param eventId the event ID to insert
     * @param timeSlot the time slot of the event
     * @return true if inserted, false otherwise
     *
     * Must run in O(log n) on average.
     */
    @Override
    public boolean add(int eventId, ITimeSlot timeSlot) {
        if (IDs.contains(eventId)) {
            return false;
        }

        if (conflicts(timeSlot)) {
            return false;
        }

        IDs.insert(eventId);
        newIDs.insert(eventId, timeSlot);

        timesIDs.insert(timeSlot, eventId);

        return true;
    }

    /**
     * Removes the given event ID if it exists.
     *
     * @param eventId the event ID to remove
     * @return true if removed, false otherwise
     *
     * Must run in O(log n) on average.
     */
    @Override
    public boolean remove(int eventId) {
        if (!IDs.contains(eventId)) {
            return false;
        }

        ITimeSlot timeSlot = newIDs.get(eventId);

        IDs.remove(eventId);
        newIDs.remove(eventId);

        if (timeSlot != null) {
            timesIDs.remove(timeSlot);
        }

        return true;
    }

    /**
     * Checks whether the given event ID exists in the schedule.
     *
     * @param eventId the event ID to search for
     * @return true if the event ID exists, false otherwise
     *
     * Must run in O(log n) on average.
     */
    @Override
    public boolean contains(int eventId) {
        return IDs.contains(eventId);
    }

    @Override
    public boolean conflicts(ITimeSlot timeSlot) {

        List<Integer> keys = IDs.getKeys();

        if (keys.empty()) {
            return false;
        }

        keys.findFirst();

        while (true) {

            int eventId = keys.retrieve();
            ITimeSlot current = newIDs.get(eventId);

            if (current != null && current.compareTo(timeSlot) == 0) {
                return true;
            }

            if (keys.last()) {
                break;
            }

            keys.findNext();
        }

        return false;
    }

    @Override
    public Set<Integer> getEventIds() {
        return IDs;
    }

    @Override
    public Map<ITimeSlot, Integer> getEvents() {
        return timesIDs;
    }

}
