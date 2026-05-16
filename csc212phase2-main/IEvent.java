/**
 * Represents an event with a time slot and a location.
 *
 * Events are compared based on their ID.
 */
public interface IEvent extends Comparable<IEvent> {

    /**
     * Returns the unique ID of the event.
     */
    int getId();

    /**
     * Returns the time slot of the event.
     */
    ITimeSlot getTimeSlot();

    /**
     * Returns the location of the event.
     */
    ILocation getLocation();

    /**
     * Returns the set of participant IDs.
     */
    Set<Integer> getParticipantIds();
}