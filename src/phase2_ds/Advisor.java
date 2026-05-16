package phase2_ds;

public class Advisor extends Person implements IAdvisor {

    ILocation officeAdvisor;

    Advisor(int id, String name, String email, ISchedule schedule, ILocation office) {
        super(id, name, email, schedule);
        officeAdvisor = office;
    }

    /**
     * Returns the office location of the advisor.
     */
    @Override
    public ILocation getOffice() {
        return officeAdvisor;
    }
}
