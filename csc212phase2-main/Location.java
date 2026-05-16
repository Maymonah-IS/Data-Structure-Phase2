public class Location implements ILocation {

    int LID;
    String LName;
    boolean reservable;
    boolean online;
    int capacity;
    ISchedule schedule = null;
    
    public Location(int id, String name, boolean reservable, boolean online, int capacity, ISchedule schedule1) {
        this.LID = id;
        this.LName = name;
        this.reservable = reservable;
        this.online = online;
        this.capacity = capacity;

        if (schedule1 != null) {
            this.schedule = schedule1;
        } else {
            this.schedule = new Schedule();
        }
    }
    /**
     * Returns a unique identifier for the location.
     */
    
    @Override
    public int getId() {
        return LID;
    }

    /**
     * Returns a human-readable name of the location.
     */
    @Override
    public String getName() {
        return LName;
    }

    /**
     * Returns true if the location can be reserved (i.e., has an occupancy schedule).
     */
    @Override
    public boolean isReservable() {
        return reservable;
    }

    /**
     * Returns the occupancy schedule if the location is reservable; null otherwise.
     */
    @Override
    public ISchedule getSchedule() {
        if (reservable) {
            return schedule;
        }
        return null;
    }

    /**
     * Returns the capacity of the location.
     * Returns:
     * - a positive integer for shared locations,
     * - 1 for private locations,
     * - -1 for unlimited capacity (e.g., online).
     */
    @Override
    public int getCapacity()
    {
        /*
               * - Private location (non-reservable, no schedule):
               * advisor office, faculty office
               * 
               * - Shared location (reservable, with capacity and occupancy schedule):
               * classroom, lecture hall, amphitheater, meeting room
               * 
               * - Online location (no capacity, no schedule):
               * Zoom meeting, Microsoft Teams session, Google Meet link
        */
        
        if (online) {
            return -1;
        }

        if (reservable) {
            return capacity;
        }

        return 1;
    }

    /**
     * Returns true if the location is online.
     */
    @Override
    public boolean isOnline() {
        return online;
    }

    /*
    * Location are compared based on their ID.
    */
    @Override
    public int compareTo(ILocation o) {
        return LID - o.getId();
    }
}
