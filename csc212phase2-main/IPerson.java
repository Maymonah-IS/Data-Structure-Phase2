/**
 * Represents a person (student or advisor) in the advising system.
 * Persons are compared by their unique ID.
 */
public interface IPerson extends Comparable<IPerson> {

    /**
     * Returns the unique ID of the person.
     */
    int getId();

    /**
     * Returns the full name of the person.
     */
    String getName();

    /**
     * Returns the email address of the person.
     */
    String getEmail();

    /**
     * Returns the schedule of the person (set of event IDs).
     */
    ISchedule getSchedule();
}