package phase2_ds;

public class AdvisingSystemPhase2 implements IAdvisingSystemPhase2 {

    Map<Integer, ILocation> locations;
    Map<Integer, IAdvisor> advisors;
    Map<Integer, IStudent> students;
    Map<Integer, IEvent> events;

    static int event_counter = 10000;

    public AdvisingSystemPhase2() {
        locations = new BSTMap<Integer, ILocation>();
        advisors = new BSTMap<Integer, IAdvisor>();
        students = new BSTMap<Integer, IStudent>();
        events = new BSTMap<Integer, IEvent>();
    }

    // Returns all advisors in the system.
    @Override
    public Set<IAdvisor> getAdvisors() {

    Set<IAdvisor> result = new BSTSet<IAdvisor>();
    List<Integer> keys = advisors.getKeys();

    if (keys.empty())
        return result;

    keys.findFirst();

    while (true) {
        result.insert(advisors.get(keys.retrieve()));

        if (keys.last())
            break;

        keys.findNext();
    }

    return result;
}

    // Returns all students in the system.
    @Override
   public Set<IStudent> getStudents() {

    Set<IStudent> result = new BSTSet<IStudent>();
    List<Integer> keys = students.getKeys();

    if (keys.empty())
        return result;

    keys.findFirst();

    while (true) {
        result.insert(students.get(keys.retrieve()));

        if (keys.last())
            break;

        keys.findNext();
    }

    return result;
}

    // Returns all locations in the system.
    @Override
    public Set<ILocation> getLocations() {

        Set<ILocation> locs = new BSTSet<ILocation>();
        List<Integer> keys = locations.getKeys();

        if (keys.empty()) {
            return locs;
        }

        keys.findFirst();

        while (true) {

            ILocation location = locations.get(keys.retrieve());
            locs.insert(location);

            if (keys.last()) {
                break;
            }

            keys.findNext();
        }

        return locs;
    }

    // Returns all meetings in the system.
    @Override
    public Set<IMeeting> getMeetings() {
        Set<IMeeting> meetings = new BSTSet<IMeeting>();
        List<Integer> keys = events.getKeys();

        if (keys.empty()) {
            return meetings;
        }

        keys.findFirst();

        while (true) {

            IEvent event = events.get(keys.retrieve());

            if (event instanceof IMeeting) {
                meetings.insert((IMeeting) event);
            }

            if (keys.last()) {
                break;
            }

            keys.findNext();
        }

        return meetings;
    }

    @Override
    public Set<IWorkshop> getWorkshops() {

        Set<IWorkshop> workshops = new BSTSet<IWorkshop>();

        List<Integer> keys = events.getKeys();

        if (keys.empty()) {
            return workshops;
        }

        keys.findFirst();

        while (true) {

            IEvent event = events.get(keys.retrieve());

            if (event instanceof IWorkshop) {
                workshops.insert((IWorkshop) event);
            }

            if (keys.last()) {
                break;
            }

            keys.findNext();
        }

        return workshops;
    }

    @Override
    public Set<IEvent> getEvents() {

        Set<IEvent> allEvents = new BSTSet<IEvent>();
        List<Integer> keys = events.getKeys();

        if (keys.empty()) {
            return allEvents;
        }

        keys.findFirst();

        while (true) {

            IEvent event = events.get(keys.retrieve());
            allEvents.insert(event);

            if (keys.last()) {
                break;
            }

            keys.findNext();
        }

        return allEvents;
    }

    public boolean addAdvisor(IAdvisor advisor) {
            if (advisor == null)
        return false;

    if (advisors.get(advisor.getId()) != null)
        return false;

    return advisors.insert(advisor.getId(), advisor);
    }

    @Override
    public IAdvisor searchAdvisorById(int advisorId) {
        return advisors.get(advisorId);
    }


    @Override
    public boolean addStudent(IStudent student) {
           if (student == null)
        return false;

    if (students.get(student.getId()) != null)
        return false;

    return students.insert(student.getId(), student);
    }

    @Override
    public IStudent searchStudentById(int studentId) {
          return students.get(studentId);
    }

    @Override
    public boolean deleteStudent(int studentId) {
        IStudent studentObject = (IStudent) students.get(studentId);

        if (studentObject == null) {
            return false;
        }

        ISchedule studentSchedule = studentObject.getSchedule();

        if (!studentSchedule.empty()) {
            List<Integer> eventIds = studentSchedule.getEventIds().getKeys();

            if (!eventIds.empty()) {
                eventIds.findFirst();
            }

            while (!eventIds.empty()) {
                IEvent updatedEvent = events.get(eventIds.retrieve());

                updatedEvent.getParticipantIds().remove(studentId);

                if (updatedEvent instanceof Meeting) {
                    events.remove(eventIds.retrieve());

                    Integer advisorId = ((Meeting) updatedEvent).getAdvisorId();

                    IAdvisor advisorObject = (Advisor) advisors.get(advisorId);

                    advisorObject.getSchedule().remove(eventIds.retrieve());

                    persons.update(advisorId, advisorObject);
                }

                if (updatedEvent instanceof Workshop
                        && updatedEvent.getParticipantIds().size() == 0) {
                    events.remove(eventIds.retrieve());

                    // remove workshop from advisor schedules
                    List<Integer> advisorIds
                            = ((Workshop) updatedEvent).getAdvisorIds().getKeys();

                    if (!advisorIds.empty()) {
                        advisorIds.findFirst();
                    }

                    while (!advisorIds.empty()) {
                        IAdvisor advisorObject
                                = (Advisor) persons.get(advisorIds.retrieve());

                        advisorObject.getSchedule().remove(eventIds.retrieve());

                        persons.update(advisorIds.retrieve(), advisorObject);

                        advisorIds.remove();
                    }

                    // remove workshop from location schedule
                    ILocation locationObject
                            = locations.get(updatedEvent.getLocation().getId());

                    locationObject.getSchedule().remove(updatedEvent.getId());

                    locations.update(updatedEvent.getLocation().getId(),
                            locationObject);
                }

                if ((updatedEvent instanceof Workshop)
                        && (updatedEvent.getParticipantIds().size() > 0)) {
                    events.update(updatedEvent.getId(), updatedEvent);
                }

                eventIds.remove();
            }
        }

        persons.remove(studentObject.getId());

        return true;
    }

    @Override
    public boolean addLocation(ILocation location) {
        if (location == null) {
            return false;
        }

        if (locations.get(location.getId()) == null) {
            return locations.insert(location.getId(), location);
        }

        return false;
    }

    @Override
    public ILocation searchLocationById(int locationId) {
        return locations.get(locationId);
    }

    @Override
    public int scheduleMeeting(ITimeSlot timeSlot, int advisorId, int studentId) throws SchedulingException {
        IAdvisor advisor = searchAdvisorById(advisorId);
        IStudent student = searchStudentById(studentId);

        if (advisor == null) {
            throw new SchedulingException(ScheduleFailureReason.ADVISOR_NOT_FOUND);
        }

        if (student == null) {
            throw new SchedulingException(ScheduleFailureReason.STUDENT_NOT_FOUND);
        }

        if (advisor.getSchedule().conflicts(timeSlot)) {
            throw new SchedulingException(ScheduleFailureReason.CONFLICT_ADVISOR);
        }

        if (student.getSchedule().conflicts(timeSlot)) {
            throw new SchedulingException(ScheduleFailureReason.CONFLICT_STUDENT);
        }

        int id = event_counter++;

        IMeeting meeting = new Meeting(
                id,
                timeSlot,
                advisor.getOffice(),
                advisorId,
                studentId
        );

        events.insert(id, meeting);

        advisor.getSchedule().add(id, timeSlot);
        student.getSchedule().add(id, timeSlot);

        persons.update(advisorId, advisor);
        persons.update(studentId, student);

        return id;
    }


    @Override
    public int scheduleWorkshop(String title, ITimeSlot timeSlot, int locationId,
            int[] advisorIds, int[] studentIds)
            throws SchedulingException {

        for (int index = 0; index < studentIds.length; index++) {
            IPerson studentPerson = this.searchStudentById(studentIds[index]);

            if (studentPerson == null) {
                throw new SchedulingException(ScheduleFailureReason.STUDENT_NOT_FOUND);
            }

            if (studentPerson.getSchedule().conflicts(timeSlot)) {
                throw new SchedulingException(ScheduleFailureReason.CONFLICT_STUDENT);
            }
        }

        for (int index = 0; index < advisorIds.length; index++) {
            IPerson advisorPerson = this.searchAdvisorById(advisorIds[index]);

            if (advisorPerson == null) {
                throw new SchedulingException(ScheduleFailureReason.ADVISOR_NOT_FOUND);
            }

            if (advisorPerson.getSchedule().conflicts(timeSlot)) {
                throw new SchedulingException(ScheduleFailureReason.CONFLICT_ADVISOR);
            }
        }

        ILocation location = locations.get(locationId);

        if (location == null) {
            throw new SchedulingException(ScheduleFailureReason.LOCATION_NOT_FOUND);
        }

        if (!location.isReservable()) {
            throw new SchedulingException(ScheduleFailureReason.LOCATION_NOT_RESERVABLE);
        }

        if (location.getSchedule().conflicts(timeSlot)) {
            throw new SchedulingException(ScheduleFailureReason.CONFLICT_LOCATION);
        }

        if (location.getCapacity() < studentIds.length) {
            throw new SchedulingException(ScheduleFailureReason.CAPACITY_EXCEEDED);
        }

        // add workshop to location schedule
        ISchedule locationSchedule = location.getSchedule();

        locationSchedule.add(event_counter, timeSlot);

        locations.update(locationId, location);

        // add workshop to student schedules
        Set<Integer> studentIdSet = new BSTSet<Integer>();

        for (int index = 0; index < studentIds.length; index++) {
            studentIdSet.insert(studentIds[index]);

            IStudent studentObject = (Student) persons.get(studentIds[index]);

            studentObject.getSchedule().add(event_counter, timeSlot);

            persons.update(studentIds[index], studentObject);
        }

        // add workshop to advisor schedules
        Set<Integer> advisorIdSet = new BSTSet<Integer>();

        for (int index = 0; index < advisorIds.length; index++) {
            advisorIdSet.insert(advisorIds[index]);

            IAdvisor advisorObject = (Advisor) persons.get(advisorIds[index]);

            advisorObject.getSchedule().add(event_counter, timeSlot);

            persons.update(advisorIds[index], advisorObject);
        }

        IWorkshop workshop = new Workshop(event_counter++, title,
                timeSlot, location, advisorIdSet, studentIdSet);

        events.insert(workshop.getId(), workshop);

        return workshop.getId();
    }

    @Override
    public boolean cancelMeeting(int meetingId) {
        IMeeting meetingObject = (Meeting) events.get(meetingId);

        if ((meetingObject == null) || !(meetingObject instanceof Meeting)) {
            return false;
        }

        events.remove(meetingId);

        IPerson studentPerson = persons.get(meetingObject.getStudentId());

        ISchedule studentSchedule = studentPerson.getSchedule();

        studentSchedule.remove(meetingId);

        persons.update(meetingObject.getStudentId(), studentPerson);

        IPerson advisorPerson = persons.get(meetingObject.getAdvisorId());

        ISchedule advisorSchedule = advisorPerson.getSchedule();

        advisorSchedule.remove(meetingId);

        persons.update(meetingObject.getAdvisorId(), advisorPerson);

        return true;
    }

    @Override
    public boolean cancelWorkshop(int workshopId) {
        IWorkshop workshopObject = (Workshop) events.get(workshopId);

        if ((workshopObject == null) || !(workshopObject instanceof Workshop)) {
            return false;
        }

        List<Integer> studentIds = workshopObject.getStudentIds().getKeys();

        if (!studentIds.empty()) {
            studentIds.findFirst();
        }

        while (!studentIds.empty()) {
            IPerson studentPerson = persons.get(studentIds.retrieve());

            studentPerson.getSchedule().remove(workshopId);

            persons.update(studentPerson.getId(), studentPerson);

            studentIds.remove();
        }

        List<Integer> advisorIds = workshopObject.getAdvisorIds().getKeys();

        if (!advisorIds.empty()) {
            advisorIds.findFirst();
        }

        while (!advisorIds.empty()) {
            IPerson advisorPerson = persons.get(advisorIds.retrieve());

            advisorPerson.getSchedule().remove(workshopId);

            persons.update(advisorPerson.getId(), advisorPerson);

            advisorIds.remove();
        }

        ILocation locationObject = locations.get(workshopObject.getLocation().getId());

        locationObject.getSchedule().remove(workshopId);

        locations.update(locationObject.getId(), locationObject);

        events.remove(workshopId);

        return true;
    }


    @Override
    public void addStudentToWorkshop(int workshopId, int studentId)
            throws SchedulingException //no color
    {
        IStudent studentObject = this.searchStudentById(studentId);

        if (studentObject == null) {
            throw new SchedulingException(ScheduleFailureReason.STUDENT_NOT_FOUND);
        }

        IEvent workshopEvent = events.get(workshopId);

        if (workshopEvent == null) {
            throw new SchedulingException(ScheduleFailureReason.EVENT_NOT_FOUND);
        }

        ISchedule studentSchedule = studentObject.getSchedule();

        if (studentSchedule.contains(workshopId) == true) {
            throw new SchedulingException(ScheduleFailureReason.CONFLICT_STUDENT);
        }

        if (studentSchedule.conflicts(workshopEvent.getTimeSlot())) {
            throw new SchedulingException(ScheduleFailureReason.CONFLICT_STUDENT);
        }

        if (workshopEvent.getLocation().getCapacity()
                < workshopEvent.getParticipantIds().size() + 1) {
            throw new SchedulingException(ScheduleFailureReason.CAPACITY_EXCEEDED);
        }

        studentObject.getSchedule().add(workshopEvent.getId(),
                workshopEvent.getTimeSlot());

        persons.update(studentId, studentObject);

        workshopEvent.getParticipantIds().insert(studentId);

        events.update(workshopId, workshopEvent);
    }

  
    @Override
    public void removeStudentFromWorkshop(int workshopId, int studentId)
            throws SchedulingException {
        IStudent studentObject = this.searchStudentById(studentId);

        if (studentObject == null) {
            throw new SchedulingException(ScheduleFailureReason.STUDENT_NOT_FOUND);
        }

        IEvent workshopEvent = events.get(workshopId);

        if (workshopEvent == null) {
            throw new SchedulingException(ScheduleFailureReason.EVENT_NOT_FOUND);
        }

        ISchedule studentSchedule = studentObject.getSchedule();

        if (!studentSchedule.contains(workshopId)) {
            throw new SchedulingException(ScheduleFailureReason.EVENT_NOT_FOUND);
        }

        if (workshopEvent.getParticipantIds().size() == 1) {
            this.cancelWorkshop(workshopId);
        } else {
            studentObject.getSchedule().remove(workshopEvent.getId());

            persons.update(studentId, studentObject);

            workshopEvent.getParticipantIds().remove(studentId);

            events.update(workshopEvent.getId(), workshopEvent);
        }
    }


    @Override
    public void addAdvisorToWorkshop(int workshopId, int advisorId)
            throws SchedulingException {
        IAdvisor advisorObject = this.searchAdvisorById(advisorId);

        if (advisorObject == null) {
            throw new SchedulingException(ScheduleFailureReason.ADVISOR_NOT_FOUND);
        }

        IEvent workshopEvent = events.get(workshopId);

        if (workshopEvent == null) {
            throw new SchedulingException(ScheduleFailureReason.EVENT_NOT_FOUND);
        }

        ISchedule advisorSchedule = advisorObject.getSchedule();

        if (advisorSchedule.contains(workshopId) == true) {
            throw new SchedulingException(ScheduleFailureReason.CONFLICT_ADVISOR);
        }

        if (advisorSchedule.conflicts(workshopEvent.getTimeSlot())) {
            throw new SchedulingException(ScheduleFailureReason.CONFLICT_ADVISOR);
        }

        advisorObject.getSchedule().add(workshopEvent.getId(),
                workshopEvent.getTimeSlot());

        persons.update(advisorId, advisorObject);

        ((Workshop) workshopEvent).getAdvisorIds().insert(advisorId);

        events.update(advisorId, workshopEvent);
    }

    @Override
    public void removeAdvisorFromWorkshop(int workshopId, int advisorId)
            throws SchedulingException {
        IAdvisor advisorObject = this.searchAdvisorById(advisorId);

        if (advisorObject == null) {
            throw new SchedulingException(ScheduleFailureReason.ADVISOR_NOT_FOUND);
        }

        IEvent workshopEvent = events.get(workshopId);

        if (workshopEvent == null) {
            throw new SchedulingException(ScheduleFailureReason.EVENT_NOT_FOUND);
        }

        ISchedule advisorSchedule = advisorObject.getSchedule();

        if (!advisorSchedule.contains(workshopId)) {
            throw new SchedulingException(ScheduleFailureReason.EVENT_NOT_FOUND);
        }

        advisorObject.getSchedule().remove(workshopEvent.getId());

        persons.update(advisorId, advisorObject);

        ((Workshop) workshopEvent).getAdvisorIds().remove(advisorId);

        events.update(workshopId, workshopEvent);
    }

}
