package Part1;

public class Task3 {
    public static void main(String[] args) {
        int [] values = new int [100];

        for (int i = 0; i < values.length; i++) {
            values[i] = i;
        }

        // Use the enhanced for loop to traverse array: for (int value : values) { ... }
        for (int value:values) {
            System.out.print(value + ", ");
        }

        System.out.println();

        // Use while loop to traverse an array.
        int i = 0;
        while (i < values.length){
            values[i] *= 2;
            System.out.print(values[i] + ", ");
            i++;
        }
    }
}
