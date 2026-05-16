package phase2_ds;

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

    Meeting(int i, ITimeSlot timeSlot, ILocation office, int advisorId, int studentId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
