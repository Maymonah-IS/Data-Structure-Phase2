/**
 * Represents a location where events can take place.
 * 
 * Examples:
 * - Private location (non-reservable, no schedule):
 * advisor office, faculty office
 * 
 * - Shared location (reservable, with capacity and occupancy schedule):
 * classroom, lecture hall, amphitheater, meeting room
 * 
 * - Online location (no capacity, no schedule):
 * Zoom meeting, Microsoft Teams session, Google Meet link
 * 
 * Location are compared based on their ID.
 */
public interface ILocation extends Comparable<ILocation> {

    /**
     * Returns a unique identifier for the location.
     */
    int getId();

    /**
     * Returns a human-readable name of the location.
     */
    String getName();

    /**
     * Returns true if the location can be reserved (i.e., has an occupancy schedule).
     */
    boolean isReservable();

    /**
     * Returns the occupancy schedule if the location is reservable; null otherwise.
     */
    ISchedule getSchedule();

    /**
     * Returns the capacity of the location.
     * Returns:
     * - a positive integer for shared locations,
     * - 1 for private locations,
     * - -1 for unlimited capacity (e.g., online).
     */
    int getCapacity();

    /**
     * Returns true if the location is online.
     */
    boolean isOnline();
}