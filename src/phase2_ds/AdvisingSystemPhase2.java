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

    @Override
    public Set<ILocation> getLocations() {
        Set<ILocation> result = new BSTSet<ILocation>();
        List<Integer> keys = locations.getKeys();

        if (keys.empty())
            return result;

        keys.findFirst();
        while (true) {
            result.insert(locations.get(keys.retrieve()));

            if (keys.last())
                break;

            keys.findNext();
        }

        return result;
    }

    @Override
    public Set<IMeeting> getMeetings() {
        Set<IMeeting> result = new BSTSet<IMeeting>();
        List<Integer> keys = events.getKeys();

        if (keys.empty())
            return result;

        keys.findFirst();
        while (true) {
            IEvent event = events.get(keys.retrieve());

            if (event instanceof IMeeting)
                result.insert((IMeeting) event);

            if (keys.last())
                break;

            keys.findNext();
        }

        return result;
    }

    @Override
    public Set<IWorkshop> getWorkshops() {
        Set<IWorkshop> result = new BSTSet<IWorkshop>();
        List<Integer> keys = events.getKeys();

        if (keys.empty())
            return result;

        keys.findFirst();
        while (true) {
            IEvent event = events.get(keys.retrieve());

            if (event instanceof IWorkshop)
                result.insert((IWorkshop) event);

            if (keys.last())
                break;

            keys.findNext();
        }

        return result;
    }

    @Override
    public Set<IEvent> getEvents() {
        Set<IEvent> result = new BSTSet<IEvent>();
        List<Integer> keys = events.getKeys();

        if (keys.empty())
            return result;

        keys.findFirst();
        while (true) {
            result.insert(events.get(keys.retrieve()));

            if (keys.last())
                break;

            keys.findNext();
        }

        return result;
    }

    @Override
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
    public boolean addLocation(ILocation location) {
        if (location == null)
            return false;

        if (locations.get(location.getId()) != null)
            return false;

        return locations.insert(location.getId(), location);
    }

    @Override
    public ILocation searchLocationById(int locationId) {
        return locations.get(locationId);
    }

    @Override
    public int scheduleMeeting(ITimeSlot timeSlot, int advisorId, int studentId)
            throws SchedulingException {

        IAdvisor advisor = advisors.get(advisorId);
        IStudent student = students.get(studentId);

        if (advisor == null)
            throw new SchedulingException(ScheduleFailureReason.ADVISOR_NOT_FOUND);

        if (student == null)
            throw new SchedulingException(ScheduleFailureReason.STUDENT_NOT_FOUND);

        if (advisor.getSchedule().conflicts(timeSlot))
            throw new SchedulingException(ScheduleFailureReason.CONFLICT_ADVISOR);

        if (student.getSchedule().conflicts(timeSlot))
            throw new SchedulingException(ScheduleFailureReason.CONFLICT_STUDENT);

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

        return id;
    }

    @Override
    public boolean cancelMeeting(int meetingId) {
        IEvent event = events.get(meetingId);

        if (event == null || !(event instanceof IMeeting))
            return false;

        IMeeting meeting = (IMeeting) event;

        IAdvisor advisor = advisors.get(meeting.getAdvisorId());
        IStudent student = students.get(meeting.getStudentId());

        if (advisor != null)
            advisor.getSchedule().remove(meetingId);

        if (student != null)
            student.getSchedule().remove(meetingId);

        events.remove(meetingId);

        return true;
    }

    @Override
    public int scheduleWorkshop(String title, ITimeSlot timeSlot, int locationId,
                                int[] advisorIds, int[] studentIds)
            throws SchedulingException {

        ILocation location = locations.get(locationId);

        if (location == null)
            throw new SchedulingException(ScheduleFailureReason.LOCATION_NOT_FOUND);

        if (!location.isReservable())
            throw new SchedulingException(ScheduleFailureReason.LOCATION_NOT_RESERVABLE);

        Set<Integer> advisorSet = new BSTSet<Integer>();
        Set<Integer> studentSet = new BSTSet<Integer>();

        for (int i = 0; i < advisorIds.length; i++) {
            IAdvisor advisor = advisors.get(advisorIds[i]);

            if (advisor == null)
                throw new SchedulingException(ScheduleFailureReason.ADVISOR_NOT_FOUND);

            if (advisor.getSchedule().conflicts(timeSlot))
                throw new SchedulingException(ScheduleFailureReason.CONFLICT_ADVISOR);

            advisorSet.insert(advisorIds[i]);
        }

        for (int i = 0; i < studentIds.length; i++) {
            IStudent student = students.get(studentIds[i]);

            if (student == null)
                throw new SchedulingException(ScheduleFailureReason.STUDENT_NOT_FOUND);

            if (student.getSchedule().conflicts(timeSlot))
                throw new SchedulingException(ScheduleFailureReason.CONFLICT_STUDENT);

            studentSet.insert(studentIds[i]);
        }

        if (location.getSchedule().conflicts(timeSlot))
            throw new SchedulingException(ScheduleFailureReason.CONFLICT_LOCATION);

        int participantCount = advisorSet.size() + studentSet.size();

        if (location.getCapacity() != -1 && participantCount > location.getCapacity())
            throw new SchedulingException(ScheduleFailureReason.CAPACITY_EXCEEDED);

        int id = event_counter++;

        IWorkshop workshop = new Workshop(
                id,
                title,
                timeSlot,
                location,
                advisorSet,
                studentSet
        );

        events.insert(id, workshop);
        location.getSchedule().add(id, timeSlot);

        List<Integer> aKeys = advisorSet.getKeys();
        if (!aKeys.empty()) {
            aKeys.findFirst();
            while (true) {
                advisors.get(aKeys.retrieve()).getSchedule().add(id, timeSlot);

                if (aKeys.last())
                    break;

                aKeys.findNext();
            }
        }

        List<Integer> sKeys = studentSet.getKeys();
        if (!sKeys.empty()) {
            sKeys.findFirst();
            while (true) {
                students.get(sKeys.retrieve()).getSchedule().add(id, timeSlot);

                if (sKeys.last())
                    break;

                sKeys.findNext();
            }
        }

        return id;
    }

    @Override
    public boolean cancelWorkshop(int workshopId) {
        IEvent event = events.get(workshopId);

        if (event == null || !(event instanceof IWorkshop))
            return false;

        IWorkshop workshop = (IWorkshop) event;

        List<Integer> studentKeys = workshop.getStudentIds().getKeys();
        if (!studentKeys.empty()) {
            studentKeys.findFirst();
            while (true) {
                IStudent student = students.get(studentKeys.retrieve());

                if (student != null)
                    student.getSchedule().remove(workshopId);

                if (studentKeys.last())
                    break;

                studentKeys.findNext();
            }
        }

        List<Integer> advisorKeys = workshop.getAdvisorIds().getKeys();
        if (!advisorKeys.empty()) {
            advisorKeys.findFirst();
            while (true) {
                IAdvisor advisor = advisors.get(advisorKeys.retrieve());

                if (advisor != null)
                    advisor.getSchedule().remove(workshopId);

                if (advisorKeys.last())
                    break;

                advisorKeys.findNext();
            }
        }

        if (workshop.getLocation() != null && workshop.getLocation().getSchedule() != null)
            workshop.getLocation().getSchedule().remove(workshopId);

        events.remove(workshopId);

        return true;
    }

    @Override
    public void addStudentToWorkshop(int workshopId, int studentId)
            throws SchedulingException {

        IEvent event = events.get(workshopId);

        if (event == null || !(event instanceof IWorkshop))
            throw new SchedulingException(ScheduleFailureReason.EVENT_NOT_FOUND);

        IStudent student = students.get(studentId);

        if (student == null)
            throw new SchedulingException(ScheduleFailureReason.STUDENT_NOT_FOUND);

        IWorkshop workshop = (IWorkshop) event;
        if (workshop.getStudentIds().contains(studentId))
            return;//kk
        
        if (student.getSchedule().conflicts(workshop.getTimeSlot()))
            throw new SchedulingException(ScheduleFailureReason.CONFLICT_STUDENT);

        int newSize = workshop.getParticipantIds().size();

        if (!workshop.getParticipantIds().contains(studentId))
            newSize++;

        if (workshop.getLocation().getCapacity() != -1
                && newSize > workshop.getLocation().getCapacity())
            throw new SchedulingException(ScheduleFailureReason.CAPACITY_EXCEEDED);

        workshop.getStudentIds().insert(studentId);
        workshop.getParticipantIds().insert(studentId);
        student.getSchedule().add(workshopId, workshop.getTimeSlot());

        events.update(workshopId, event);
    }

    @Override
    public void removeStudentFromWorkshop(int workshopId, int studentId)
            throws SchedulingException {

        IEvent event = events.get(workshopId);

        if (event == null || !(event instanceof IWorkshop))
            throw new SchedulingException(ScheduleFailureReason.EVENT_NOT_FOUND);

        IStudent student = students.get(studentId);

        if (student == null)
            throw new SchedulingException(ScheduleFailureReason.STUDENT_NOT_FOUND);

        IWorkshop workshop = (IWorkshop) event;

        if (!workshop.getStudentIds().contains(studentId))
            throw new SchedulingException(ScheduleFailureReason.STUDENT_NOT_FOUND);
        
        student.getSchedule().remove(workshopId);
        workshop.getStudentIds().remove(studentId);
        workshop.getParticipantIds().remove(studentId);

        if (workshop.getParticipantIds().size() == 0)
            cancelWorkshop(workshopId);
        else
            events.update(workshopId, event);
    }

    @Override
    public void addAdvisorToWorkshop(int workshopId, int advisorId)
            throws SchedulingException {

        IEvent event = events.get(workshopId);

        if (event == null || !(event instanceof IWorkshop))
            throw new SchedulingException(ScheduleFailureReason.EVENT_NOT_FOUND);

        IAdvisor advisor = advisors.get(advisorId);

        if (advisor == null)
            throw new SchedulingException(ScheduleFailureReason.ADVISOR_NOT_FOUND);

        IWorkshop workshop = (IWorkshop) event;
        if (workshop.getAdvisorIds().contains(advisorId))
            return;//kk
        if (advisor.getSchedule().conflicts(workshop.getTimeSlot()))
            throw new SchedulingException(ScheduleFailureReason.CONFLICT_ADVISOR);

        int newSize = workshop.getParticipantIds().size();

        if (!workshop.getParticipantIds().contains(advisorId))
            newSize++;

        if (workshop.getLocation().getCapacity() != -1
                && newSize > workshop.getLocation().getCapacity())
            throw new SchedulingException(ScheduleFailureReason.CAPACITY_EXCEEDED);

        workshop.getAdvisorIds().insert(advisorId);
        workshop.getParticipantIds().insert(advisorId);
        advisor.getSchedule().add(workshopId, workshop.getTimeSlot());

        events.update(workshopId, event);
    }

    @Override
    public void removeAdvisorFromWorkshop(int workshopId, int advisorId)
            throws SchedulingException {

        IEvent event = events.get(workshopId);

        if (event == null || !(event instanceof IWorkshop))
            throw new SchedulingException(ScheduleFailureReason.EVENT_NOT_FOUND);

        IAdvisor advisor = advisors.get(advisorId);

        if (advisor == null)
            throw new SchedulingException(ScheduleFailureReason.ADVISOR_NOT_FOUND);

        IWorkshop workshop = (IWorkshop) event;

        if (!workshop.getAdvisorIds().contains(advisorId))
            throw new SchedulingException(ScheduleFailureReason.ADVISOR_NOT_FOUND);
        
        advisor.getSchedule().remove(workshopId);
        workshop.getAdvisorIds().remove(advisorId);
        workshop.getParticipantIds().remove(advisorId);

        if (workshop.getParticipantIds().size() == 0)
            cancelWorkshop(workshopId);
        else
            events.update(workshopId, event);
    }

    @Override
    public boolean deleteStudent(int studentId) {
        IStudent student = students.get(studentId);

        if (student == null)
            return false;

        List<Integer> eventIds = student.getSchedule().getEventIds().getKeys();

        if (!eventIds.empty()) {
            eventIds.findFirst();

            while (true) {
                int eventId = eventIds.retrieve();
                IEvent event = events.get(eventId);

                if (event instanceof IMeeting) {
                    cancelMeeting(eventId);
                } else if (event instanceof IWorkshop) {
                    try {
                        removeStudentFromWorkshop(eventId, studentId);
                    } catch (SchedulingException e) {
                    }
                }

                if (eventIds.last())
                    break;

                eventIds.findNext();
            }
        }

        students.remove(studentId);

        return true;
    }
}