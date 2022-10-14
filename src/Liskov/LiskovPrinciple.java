package Liskov;

public class LiskovPrinciple {

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
     * @title Liskov Substitution
     * @summary the Liskov Substitution Principle (LSP) states that objects of a superclass should be replaceable with
     *          objects of its subclasses without breaking the application. In other words, what we want is to have the
     *          objects of our subclasses behaving the same way as the objects of our superclass.
     */

    /**
     * @author Abhishek Jadon
     */


    /**
     * defining the structure of engine
     */
    static class Engine{

        public void on(){
            // some logic
        }

        public void Off(){
            // some logic
        }

        public void fuelOn(){
            // some logic
        }

        public void fuelOff(){
            // some logic
        }

    }

    /**
     * car interface defining the properties and behaviour of a car
     */
    interface Car{
        void turnOnEngine();
        void accelerate();
        void break_();
    }

    // the object of MotorCar class is able to replace the object of Engine class
    static class MotorCar implements Car{

        Engine engine = new Engine();


        @Override
        public void turnOnEngine() {
            engine.on();
        }

        @Override
        public void accelerate() {
            engine.fuelOn();
        }

        @Override
        public void break_() {
            engine.Off();
        }


    }


//  the object of ElectricCar class is not able to replace the object of Engine class
    static class ElectricCar implements Car{

        private Engine engine;

        /**
         * This is a blatant violation of Liskov substitution and is a bit harder to fix than our previous two principles.
         */
        @Override
        public void turnOnEngine() {
            throw  new AssertionError("I don't have an engine !");
        }

        @Override
        public void accelerate() {

        }

        @Override
        public void break_() {

        }
    }


}
