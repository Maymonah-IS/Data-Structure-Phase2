public class Student extends Person implements IStudent {

        private String studentMajor;

        public Student(int id, String name, String email, ISchedule schedule, String major) {
            super(id, name, email, schedule);
            studentMajor = major;
        }
          public String getMajor()
        {
            return studentMajor;
        }
}
