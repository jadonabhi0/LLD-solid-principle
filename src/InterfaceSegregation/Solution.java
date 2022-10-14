package InterfaceSegregation;

public class Solution {


    /**
     * Keep only those members that are of client use.
     */

    interface Rectangle_{
        void drawRectangle();
    }

    interface Circle_{
        void drawCircle();
    }

    interface Square_{
        void drawSquare();
    }



    class Circle implements Circle_{

        @Override
        public void drawCircle() {
            // some logic
        }
    }


    class Rectangle implements Rectangle_{

        @Override
        public void drawRectangle() {

        }
    }

}
