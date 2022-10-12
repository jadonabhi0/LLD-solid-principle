public class SRP_SOLUTION {


    /**
     *  @author Abhishek Jadon.
     */
    class Student{
        int name;
        int age;
        int dob;
        int rollNo;

        /**
         * Defining the constructor of class
         * @param name name of the student
         * @param age age of the student
         * @param dob date of birth if the student
         * @param rollNo serial num of student
         */

        public Student(int name, int age, int dob, int rollNo) {
            this.name = name;
            this.age = age;
            this.dob = dob;
            this.rollNo = rollNo;
        }

    }


    class Register{

        /**
         * Function to register the student to database
         * @param name name of the student
         * @param age age of the student
         * @param dob date of birth if the student
         */

        @Deprecated
        public void registerStudent(String name, String dob, int age){
            // some logic
        }

    }

    class SendEmail{

        /**
         * Function that sends an email to student
         * @param name name of the student
         * @param email email of the student
         *
         */

        @Deprecated
        public void sendEmail(String name, String email){
            // some logic
        }

    }

    class calculateResult{

        /**
         * Function that calculates the marks % of student
         * @param name name of the student
         * @param marksArray array that contains the marks of student
         */

        @Deprecated
        public void calculateResult(String name, int[] marksArray){
            // some logic
        }
    }



    public static void main(String[] args) {

    }
}
