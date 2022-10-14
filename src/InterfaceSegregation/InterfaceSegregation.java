package InterfaceSegregation;

public class InterfaceSegregation {

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


    /***
     *
     * @author Abhishek Jadon
     *
     * @title Interface Segregation
     * @summary Clients should not be forced to depend upon interfaces that they do not use.
     * @advantages lower coupling
     */


    /**
     * defining the interface that comprises some members
     */
    interface Shape{
        void drawRectangle();
        void drawCircle();
        void drawSquare();
        void drawPentagon();
    }

    // here the interface segregation principle is violated.
    class Circle implements Shape{

        @Override
        public void drawRectangle() {

        }

        @Override
        public void drawCircle() {

        }

        @Override
        public void drawSquare() {

        }

        @Override
        public void drawPentagon() {

        }
    }


    class Rectangle implements Shape{

        @Override
        public void drawRectangle() {

        }

        @Override
        public void drawCircle() {

        }

        @Override
        public void drawSquare() {

        }

        @Override
        public void drawPentagon() {

        }
    }

}
