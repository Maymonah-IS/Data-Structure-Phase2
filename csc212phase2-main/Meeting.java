/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maymonah PC
 */
public class Meeting extends Event implements IMeeting{
    private int advisorId;
    private int studentId;

    public Meeting(int id, ITimeSlot timeSlot, ILocation location, Set<Integer> participantIds,int advisorId, int studentId) {
        super(id, timeSlot, location, participantIds);
        this.advisorId = advisorId;
        this.studentId = studentId;
    }
    
    @Override
    public int getAdvisorId() {
        return advisorId;
    }

    @Override
    public int getStudentId() {
        return studentId;
    }

}
