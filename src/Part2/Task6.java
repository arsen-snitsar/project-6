package Part2;
import java.util.Random;
import java.util.Scanner;

public class Task6 {

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
        System.out.println();
        return randomArray;
    }

    public static int searchInArray(int search, int [] arrayWhereSearch){
        for (int i = 0; i < arrayWhereSearch.length; i++) {
            if (search == arrayWhereSearch[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.print("Please, enter the number of elements in the array: ");
        int [] arrayWhereSearch = createRandomArray(keyboard.nextInt());
        System.out.println("Please, enter which number to search for in the array: ");
        System.out.println(searchInArray(keyboard.nextInt(), arrayWhereSearch));
    }
}
