public class OpenClosePrinciple {


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
     * @title OPEN/CLOSE PRINCIPLE
     * @summary classes should be open for extension but closed for modification. In doing so, we stop ourselves
     *          from modifying existing code and causing potential new bugs in an otherwise happy application.
     */


    /**
     * @author Abhishek Jadon
     */

    interface CompareValue{
        /**
         *
         * @param value1 1st input
         * @param value2 2nd input
         * @return +ve if value1 > value2,-ve if value2 > value1 and 0 if value1 == value2
         */
        int compare(int value1, int value2);
    }

    /**
     * Descending Comparator
     */
    static class DescComparator implements CompareValue{

        @Override
        public int compare(int value1, int value2) {
            return value2 - value1;
        }
    }

    /**
     * Ascending comparator
     */
    static class AscComparator implements CompareValue{

        @Override
        public int compare(int value1, int value2) {
            return value1 - value2;
        }
    }


   static class ArraySort{
        /**
         *
         * @param array given
         * @param comparator decide sorting order
         */
        public void sort(int[] array, CompareValue comparator){
           for(int i = 0 ; i < array.length ; i++){
               for(int j = i+1 ; j < array.length ; j++){
                   if(comparator.compare(array[i], array[j]) > 0){
                       int temp = array[i];
                       array[i] = array[j];
                       array[j] = temp;
                   }
               }
           }
        }


        public void printArray(int[] array) {
            for(int i = 0 ; i < array.length ; i++) {
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {

        int[] array = {34,23,4,23,42,4,67,5865,4,534,53,4};
        ArraySort arraySort = new ArraySort();
        arraySort.sort(array, new AscComparator());
        arraySort.printArray(array);

        arraySort.sort(array, new DescComparator());
        arraySort.printArray(array);
    }


}
