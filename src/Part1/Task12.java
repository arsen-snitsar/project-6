package Part1;

public class Task12 {
    public static void main(String[] args) {

        // Demonstrate array creation:

        // With predefined size: new int[10]
        int [] predefinedSizeArray = new int[10];

        // With size defined in a variable: int[size]
        int arraySize = 100;
        int [] variableDefinedArray = new int[arraySize];

        // Literal array creation
        boolean [] literalArray = {true, true, false, true};

        // Different types of array
        int [] integerArray = new int[2023];
        double [] doubleArray = new double[100];
        String [] fruitArray = {"Apple", "Banana", "Orange"};
        char [] characterArray = {'H', 'e', 'l', 'l', 'o', '!'};

        // Show use of array.length.
        for (int i = 0; i < integerArray.length; i++) {
            // Assign value to array element: a[4] = 45
            integerArray[i] = i + 1;
            // Print array element value: ...println("5th element value: " + a[4])
            System.out.println(i + ": " + integerArray[i]);
        }

        //System.out.println(integerArray[100000]);

    }
}
