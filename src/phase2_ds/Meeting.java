package phase2_ds;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Maymonah PC
 */
public class Meeting extends Event implements IMeeting {

    private int advisorId;
    private int studentId;

    public Meeting(int id, ITimeSlot ts, ILocation location, int aid, int studentId) {
        super(id, ts, location, new BSTSet());

        super.participantIds.insert(studentId);
        super.participantIds.insert(aid);

        this.advisorId = aid;
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
