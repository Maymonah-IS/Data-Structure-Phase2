/**
 * The interface of the Student Advising System (Phase 2).
 */
public interface IAdvisingSystemPhase2 {

    /**
     * Returns all advisors in the system.
     */
    Set<IAdvisor> getAdvisors();

    /**
     * Returns all students in the system.
     */
    Set<IStudent> getStudents();

    /**
     * Returns all locations in the system.
     */
    Set<ILocation> getLocations();

    /**
     * Returns all meetings in the system.
     */
    Set<IMeeting> getMeetings();

    /**
     * Returns all workshops in the system.
     */
    Set<IWorkshop> getWorkshops();

    /**
     * Returns all events in the system.
     */
    Set<IEvent> getEvents();

    /**
     * Adds an advisor to the system.
     *
     * @param advisor the advisor to add
     * @return true if added, false if an advisor with the same ID already exists
     */
    boolean addAdvisor(IAdvisor advisor);

    /**
     * Searches for an advisor by ID.
     *
     * @param advisorId the advisor ID
     * @return the advisor if found, null otherwise
     */
    IAdvisor searchAdvisorById(int advisorId);

    /**
     * Adds a student to the system.
     *
     * @param student the student to add
     * @return true if added, false if a student with the same ID already exists
     */
    boolean addStudent(IStudent student);

    /**
     * Searches for a student by ID.
     *
     * @param studentId the student ID
     * @return the student if found, null otherwise
     */
    IStudent searchStudentById(int studentId);

    /**
     * Deletes a student and updates all related events:
     * - meetings involving the student are deleted
     * - the student is removed from workshops
     * - workshops with no remaining participants are deleted
     *
     * @param studentId the student ID
     * @return true if the student existed and was deleted, false otherwise
     */
    boolean deleteStudent(int studentId);

    /**
     * Adds a location to the system.
     *
     * @param location the location to add
     * @return true if added, false if a location with the same ID already exists
     */
    boolean addLocation(ILocation location);

    /**
     * Searches for a location by ID.
     *
     * @param locationId the location ID
     * @return the location if found, null otherwise
     */
    ILocation searchLocationById(int locationId);

    /**
     * Schedules a one-to-one meeting between an advisor and a student.
     * The meeting takes place in the advisor's office.
     *
     * Requirements:
     * - advisor and student must exist
     * - no schedule conflict for either participant
     *
     * @param timeSlot  the time slot of the meeting
     * @param advisorId the advisor ID
     * @param studentId the student ID
     * @return the ID of the created meeting
     * @throws SchedulingException if scheduling fails
     */
    int scheduleMeeting(ITimeSlot timeSlot, int advisorId, int studentId)
            throws SchedulingException;

    /**
     * Schedules a workshop for multiple advisors and students at a shared location.
     *
     * Requirements:
     * - all advisors and students must exist
     * - location must exist and be reservable
     * - no schedule conflict for any participant
     * - no conflict with the location occupancy
     *
     * @param title      the workshop title
     * @param timeSlot   the time slot of the workshop
     * @param locationId the location ID
     * @param advisorIds the advisor IDs
     * @param studentIds the student IDs
     * @return the ID of the created workshop
     * @throws SchedulingException if scheduling fails
     */
    int scheduleWorkshop(String title, ITimeSlot timeSlot, int locationId,
                         int[] advisorIds, int[] studentIds)
            throws SchedulingException;

    /**
     * Cancels a meeting by ID.
     *
     * @param meetingId the meeting ID
     * @return true if removed, false otherwise
     */
    boolean cancelMeeting(int meetingId);

    /**
     * Cancels a workshop by ID.
     *
     * @param workshopId the workshop ID
     * @return true if removed, false otherwise
     */
    boolean cancelWorkshop(int workshopId);

    /**
     * Adds a student to a workshop.
     *
     * Requirements:
     * - workshop and student must exist
     * - student must not already be in the workshop
     * - no schedule conflict for the student
     * - location capacity must not be exceeded
     *
     * @param workshopId the workshop ID
     * @param studentId  the student ID to add
     * @throws SchedulingException if the operation fails
     */
    void addStudentToWorkshop(int workshopId, int studentId)
            throws SchedulingException;

    /**
     * Removes a student from a workshop.
     *
     * Requirements:
     * - workshop and student must exist
     * - student must be part of the workshop
     * - if the workshop becomes empty, it is deleted
     *
     * @param workshopId the workshop ID
     * @param studentId  the student ID to remove
     * @throws SchedulingException if the operation fails
     */
    void removeStudentFromWorkshop(int workshopId, int studentId)
            throws SchedulingException;

    /**
     * Adds an advisor to a workshop.
     *
     * Requirements:
     * - workshop and advisor must exist
     * - advisor must not already be in the workshop
     * - no schedule conflict for the advisor
     *
     * @param workshopId the workshop ID
     * @param advisorId  the advisor ID to add
     * @throws SchedulingException if the operation fails
     */
    void addAdvisorToWorkshop(int workshopId, int advisorId)
            throws SchedulingException;

    /**
     * Removes an advisor from a workshop.
     *
     * Requirements:
     * - workshop and advisor must exist
     * - advisor must be part of the workshop
     *
     * @param workshopId the workshop ID
     * @param advisorId  the advisor ID to remove
     * @throws SchedulingException if the operation fails
     */
    void removeAdvisorFromWorkshop(int workshopId, int advisorId)
            throws SchedulingException;
}