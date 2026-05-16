package phase2_ds;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Maymonah PC
 */
public class Workshop extends Event implements IWorkshop {

    private String workShopTitle;

    private Set<Integer> advisorIds;
    private Set<Integer> studentIds;

    public Workshop(
            int id,
            String title,
            ITimeSlot timeSlot,
            ILocation location,
            Set<Integer> advisorSet,
            Set<Integer> studentSet) {

        super(
                id,
                timeSlot,
                location,
                buildParticipants(advisorSet, studentSet)
        );

        this.workShopTitle = title;

        advisorIds = copySet(advisorSet);
        studentIds = copySet(studentSet);
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
        return studentIds;
    }

    // ======================================
    private static Set<Integer> copySet(Set<Integer> original) {

        Set<Integer> copy = new BSTSet<Integer>();

        List<Integer> keys = original.getKeys();

        if (!keys.empty()) {

            keys.findFirst();

            while (true) {

                copy.insert(keys.retrieve());

                if (keys.last()) {
                    break;
                }

                keys.findNext();
            }
        }

        return copy;
    }

    private static Set<Integer> buildParticipants(
            Set<Integer> advisors,
            Set<Integer> students) {

        Set<Integer> all = new BSTSet<Integer>();

        List<Integer> advisorKeys = advisors.getKeys();

        if (!advisorKeys.empty()) {

            advisorKeys.findFirst();

            while (true) {

                all.insert(advisorKeys.retrieve());

                if (advisorKeys.last()) {
                    break;
                }

                advisorKeys.findNext();
            }
        }

        List<Integer> studentKeys = students.getKeys();

        if (!studentKeys.empty()) {

            studentKeys.findFirst();

            while (true) {

                all.insert(studentKeys.retrieve());

                if (studentKeys.last()) {
                    break;
                }

                studentKeys.findNext();
            }
        }

        return all;
    }
}
