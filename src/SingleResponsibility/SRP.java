package SingleResponsibility;

public class SRP {

    /**
     *  Solid design principles encourage us to create more maintainable, understandable, and flexible software.
     *  Consequently, as our applications grow in size, we can reduce their complexity and save ourselves a lot of
     *  headaches further down the road!
     *
     *  The following 5 SOLID Principles are-
     *
     *  1. Single Responsible Principle
     *  2. Open/Close Principle
     *  3. Liskov Substitution
     *  4. Interface Segregation
     *  5. Dependency Segregation
     *
     */


    /**
     *  @title SINGLE RESPONSIBILITY PRINCIPLE.
     *  @summary a class should have only one responsibility, one single purpose. Furthermore, it should have one reason to change.
     *  @advantages Ease in testing, Lower Coupling, Organization.
     *
     */

    /**
     *  @author Abhishek Jadon.
     */
    class Student{
        String name;
        int age;
        String dob;
        int rollNo;

        /**
         * Defining the constructor of class
         * @param name name of the student
         * @param age age of the student
         * @param dob date of birth if the student
         * @param rollNo serial num of student
         */

        public Student(String name, int age, String dob, int rollNo) {
            this.name = name;
            this.age = age;
            this.dob = dob;
            this.rollNo = rollNo;
        }

        public Student(){}

        /**
         * Function to register the student to database
         * @param name name of the student
         * @param age age of the student
         * @param dob date of birth if the student
         */


        public static void registerStudent(String name, String dob, int age){
            // some logic
        }

        /**
         * Function that sends an email to student
         * @param name name of the student
         * @param email email of the student
         *
         */

        @Deprecated
        public static void sendEmail(String name, String email){
            // some logic
        }



        /**
         * Function that calculates the marks % of student
         * @param name name of the student
         * @param marksArray array that contains the marks of student
         */

        @Deprecated
        public static void calculateResult(String name, int[] marksArray){
            // some logic
        }

    }


    class Professor {

        String name;
        int age;
        String dob;
        int rollNo;
        String email;

        /**
         * Defining the constructor of class
         *
         * @param name   name of the student
         * @param age    age of the student
         * @param dob    date of birth if the student
         * @param rollNo serial num of student
         */
        public Professor(int name, int age, int dob, int rollNo) {
            // some code
        }

        public void registerStudent(){
            Student.registerStudent(name, dob, age);
        }

        public void sendEmail(){
            Student.sendEmail(name,email);
        }

    }

        class Dean {

            /**
             * Defining the constructor of class
             *
             * @param name   name of the student
             * @param age    age of the student
             * @param dob    date of birth if the student
             * @param rollNo serial num of student
             */
            public Dean(String name, int age, String dob, int rollNo) {
                // some logic
            }


            public void registerStudent(String name, String dob, int age) {
                Student.registerStudent(name, dob, age);
            }


            public void sendEmail(String name, String email) {
                Student.sendEmail(name, email);
            }


            public void calculateResult(String name, int[] marksArray) {
                Student.calculateResult(name, marksArray);
            }
        }






    /**
     * @apiNote
     *
     * Class Student have three methods and their implementations and class Dean and class Professor are the derived
     * class of student.
     * Here the point of communication is class student is serving 3 responsibility and any change in derived class
     * can effect in base class.
     *
     * @see SRP_SOLUTION
     */

    public static void main(String[] args) {

    }

}
