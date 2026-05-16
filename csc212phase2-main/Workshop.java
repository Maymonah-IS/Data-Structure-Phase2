/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maymonah PC
 */
public class Workshop extends Event implements IWorkshop{
    private String workShopTitle;
    private Set<Integer> advisorIds;
    private Set<Integer> participantIds;

    public Workshop(int id, String title, ITimeSlot timeSlot, ILocation location, Set<Integer> advisorIds, Set<Integer> participantIds) {
        super(id, timeSlot, location, participantIds);
        this.workShopTitle = title;
        this.advisorIds = advisorIds;
        this.participantIds = participantIds;
    }
    
    @Override
    public String getTitle() {
        return workShopTitle;
    }

    @Override
    public Set<Integer> getAdvisorIds() {
        return advisorIds;
    }

    @Override
    public Set<Integer> getStudentIds() {
        return participantIds;
    }

}
