package src;


import java.util.Scanner;

public class RemoveDup {
    static int removeDuplicates(int[] toClean, int size) {
        int index = 1;
        // If array is empty or contains only one value is no duplicates exist

        if (size == 0 || size == 1)
            return size;
        for (int i = 0; i < size - 1; i++) {

            if (toClean[i] != toClean[i + 1]) {
                toClean[index] = toClean[i + 1];
                index++;
            }
        }
        return index;


    }

    // Driver code
    public static void getArray() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter array size");
        int size = userInput.nextInt();
        int[] toClean = new int[size];
        System.out.println("Please enter array in ascending order");
        for (int i = 0; i < size; i++) {
            toClean[i] = userInput.nextInt();
        }

        // removeDuplicates() returns new size of array
        int arraySize = removeDuplicates(toClean, size);

        // Print updated array
        for (int i = 0; i < arraySize; i++)
            System.out.print(toClean[i] + " ");
    }
}


