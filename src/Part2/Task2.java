package Part2;
import java.util.Random;
import java.util.Scanner;

// Create method for an array creation with random values. The method gets length of array as an argument,
// creates an array, fill element values by random values. Return value of the method is new array.

public class Task2 {

    public static Scanner keyboard = new Scanner(System.in);
    public static Random random = new Random();

    public static int [] createRandomArray(int length){
        int [] randomArray = new int[length];
        randomArray[0] = random.nextInt(10) + 1;
        System.out.print(randomArray[0]);
        for (int i = 1; i < length; i++) {
            randomArray[i] = random.nextInt(10) + 1;
            System.out.print(", " + randomArray[i]);
        }
        return randomArray;
    }

    public static void main(String[] args) {
        System.out.print("Enter array length: ");
        createRandomArray(keyboard.nextInt());
    }
}
