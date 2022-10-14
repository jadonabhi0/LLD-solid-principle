package DependencyInversion;

public class Solution {

    // solution
    // dependency of each class on other class is minimized here.
    interface vehicle{
         void hasWheels();
         void hasEngine();
         void hasColor();
         void hasFuel();
    }

    interface Bike{
         void turnONEngine();
         void turnOffEngine();
         void accelerate();
    }

    interface Car{
        void hasFourWheels();
        void hasPowerfulEngine();
        void hasPressureBreak();
    }


    class Ktm implements Bike{

        @Override
        public void turnONEngine() {

        }

        @Override
        public void turnOffEngine() {

        }

        @Override
        public void accelerate() {

        }
    }


    class Ferrari implements Car{

        @Override
        public void hasFourWheels() {

        }

        @Override
        public void hasPowerfulEngine() {

        }

        @Override
        public void hasPressureBreak() {

        }
    }

}
