package phase2_ds;

/**
 * Represents a single advisor in the advising system.
 */
public interface IAdvisor extends IPerson {

    /**
     * Returns the office location of the advisor.
     */
    ILocation getOffice();
}