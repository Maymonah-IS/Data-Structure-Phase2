package phase2_ds;

/**
 * Represents a single student in the advising system.
 */
public interface IStudent extends IPerson {

    /**
     * Returns the major of the student.
     */
    String getMajor();
}