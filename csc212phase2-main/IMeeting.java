/**
 * Represents a one-to-one meeting between an advisor and a student.
 */
public interface IMeeting extends IEvent {

    /**
     * Returns the advisor ID.
     */
    int getAdvisorId();

    /**
     * Returns the student ID.
     */
    int getStudentId();
}