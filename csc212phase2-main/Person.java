/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maymonah PC
 */
class Person implements IPerson{
    //attributes:
    int personId;
    String name;
    String email;
    ISchedule schedule;//list of events where they are identified by their IDs and time slots
    
    public Person(int id, String name,String email, ISchedule schedule){
         this.personId = id;
         this.name = name;
         this.email = email;
         this.schedule = schedule;
     } 
    
    @Override
    public int getId() {
        return personId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public ISchedule getSchedule() {//Returns the schedule of the person (set of event IDs).
        return (ISchedule) schedule.getEventIds();
    }

    @Override
    public int compareTo(IPerson other) {//Persons are compared by their unique ID.
       if (this.getId() == other.getId())
            return 0;
        if (this.getId() < other.getId())
            return -1;
        return 1;  
    }
}
