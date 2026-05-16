
public class Schedule implements ISchedule{

    private Map<ITimeSlot, Integer> timesIDs;
    private Map<Integer, ITimeSlot> newIDs;
    private Set<Integer> IDs;

        public Schedule()
        {
            timesIDs = new BSTMap<ITimeSlot, Integer>();
            newIDs = new BSTMap<Integer, ITimeSlot>();
            IDs = new BSTSet<Integer>();
        }
        
        

	@Override
	public int size() {
		return timesIDs.size();
		}

	@Override
	public boolean empty() {
		return timesIDs.empty();
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
	@Override
	public boolean add(int eventId, ITimeSlot timeSlot) {
        if (IDs.contains(eventId)) {
            return false;
        }

        if (conflicts(timeSlot)) {
            return false;
        }
        IDs.insert(eventId);
        timesIDs.insert(timeSlot, eventId);
        newIDs.insert(eventId, timeSlot);
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
        timesIDs.remove(timeSlot);

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
		return timesIDs.get(timeSlot) != null;
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
