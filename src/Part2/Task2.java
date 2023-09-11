package Part2;
import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static Scanner keyboard = new Scanner(System.in);
    public static Random random = new Random();

    public static int [] createRandomArray(int length){
        int [] randomArray = new int[length];
        for (int i = 0; i < length; i++) {
            randomArray[i] = random.nextInt(10) + 1;
            System.out.print(randomArray[i] + ", ");
        }
        return randomArray;
    }

    public static void main(String[] args) {
        System.out.print("Enter array length: ");
        createRandomArray(keyboard.nextInt());
    }
}
