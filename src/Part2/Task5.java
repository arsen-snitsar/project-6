package Part2;
import java.util.Scanner;

// Ask user to set array length and create it (use method 2.2). Find the largest value of an array.
// Print the largest value. Apply user friendly interaction.

public class Task5 {

    public static Scanner keyboard = new Scanner(System.in);

    public static int [] inputArray(int length){
        int [] userArray = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter element №" + (i+1) + ": ");
            userArray[i] = keyboard.nextInt();
        }
        return userArray;
    }

    public static int largestValue(int [] integerArray){
        int largestValue = integerArray[0];
        for (int value: integerArray) {
            if (value > largestValue)
                largestValue = value;
        }
        return largestValue;
    }

    public static void main(String[] args) {
        System.out.print("Please, enter the number of elements in the array: ");
        int [] userArray = inputArray(keyboard.nextInt());
        System.out.println("Largest value: " + largestValue(userArray));
    }
}
