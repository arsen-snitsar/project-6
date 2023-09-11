package Part2;
import java.util.Scanner;

// Ask user to create an array (use method 2.1). Calculate and print sum of the array using loop.
// Apply user friendly interaction.

public class Task4 {

    public static Scanner keyboard = new Scanner(System.in);

    public static int [] inputArray(int length){
        int [] userArray = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter element №" + (i+1) + ": ");
            userArray[i] = keyboard.nextInt();
        }
        return userArray;
    }

    public static int sum (int [] userArray){
        int total = 0;
        for (int value: userArray)
            total += value;
        return total;
    }

    public static void main(String[] args) {
        System.out.print("Please, enter the number of elements in the array: ");
        int [] userArray = inputArray(keyboard.nextInt());
        System.out.println(sum(userArray));
    }
}
