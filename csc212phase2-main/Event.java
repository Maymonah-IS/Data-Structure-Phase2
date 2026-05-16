/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maymonah PC
 */
public class Event implements IEvent {
    //attributes:
    int eventId;
    ITimeSlot timeSlot;
    ILocation location;
    Set<Integer> participantIds;
    
    public Event (int id,ITimeSlot timeSlot, ILocation location, Set<Integer> participantIds){
        this.eventId = id;
        this.timeSlot = timeSlot;
        this.location = location;
        this.participantIds = participantIds;
    }
    
    @Override
    public int getId() {
        return eventId;
    }

    @Override
    public ITimeSlot getTimeSlot() {
        return timeSlot;
    }

    @Override
    public ILocation getLocation() {
        return location;
    }

    @Override
    public Set<Integer> getParticipantIds() {
        return participantIds;
    }

    @Override
    public int compareTo(IEvent other) {//Events are compared based on their ID.
        if (this.getId() == other.getId())
            return 0;
        if (this.getId() < other.getId())
            return -1;
        return 1;  
    }
}
