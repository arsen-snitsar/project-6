package Part2;

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
