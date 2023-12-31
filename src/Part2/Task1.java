package Part2;
import java.util.Scanner;

// Create method for array input by user. The method gets length of array as an argument,
// creates an array and manages user input for every element. Return value of the method is new array.

public class Task1 {

    public static Scanner keyboard = new Scanner(System.in);

    public static int [] inputArray(int length){
        int [] userArray = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter element №" + (i+1) + ": ");
            userArray[i] = keyboard.nextInt();
        }
        return userArray;
    }

    public static void main(String[] args) {
        System.out.print("Enter array length: ");
        int [] userArray = inputArray(keyboard.nextInt());

        for (int element:userArray) {
            System.out.print(element + ", ");
        }
    }
}
