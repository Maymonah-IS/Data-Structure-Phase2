/**
 * Represents a workshop involving multiple advisors and students.
 */
public interface IWorkshop extends IEvent {

    /**
     * Returns the title of the workshop.
     */
    String getTitle();

    /**
     * Returns the set of advisor IDs.
     */
    Set<Integer> getAdvisorIds();

    /**
     * Returns the set of student IDs.
     */
    Set<Integer> getStudentIds();
}