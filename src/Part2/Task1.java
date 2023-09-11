package Part2;
import java.util.Scanner;

public class Task1 {

    public static Scanner keyboard = new Scanner(System.in);

    public static int [] inputArray(int length){
        int [] userArray = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter element №" + i + ": ");
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
