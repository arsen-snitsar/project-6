package Part2;

// Create a method for array printing. The method gets array as an argument.
// The method prints the array in user friendly way.

public class Task3 {

    public static void printArray(int [] arrayToPrint){
        System.out.print(arrayToPrint[0]);
        for (int i = 1; i < arrayToPrint.length; i++) {
            System.out.print(", " + arrayToPrint[i]);
        }
    }

    public static void main(String[] args) {
        int [] someArray = {1, 2, 10, 5, 40, 124, 412};
        printArray(someArray);
    }
}
