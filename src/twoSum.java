package src;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//Description given an array of integers return the two indices whos sum is equal to a given target assuming that each input has one solution

import java.util.Scanner;

class twoSum {

    //Brute force  O(n^2)
    private static int[] bruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }


    public static void twoSum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array");
        int arraySize = input.nextInt();
        int[] nums = new int[arraySize];
        System.out.println("Please enter the array:");
//fill the array
        for (int i = 0; i < arraySize; i++) {
            nums[i] = input.nextInt();

        }
        //get the target number
        System.out.println("enter target number");
        int target = input.nextInt();
// close the scanner
        input.close();
//make a new array by calling the brute force class  should return an int array
        int[] indices = bruteForce(nums, target);
// check if the indices  array is of length 2 if there are more or less  a solution cant be found
        if (indices.length == 2) {
            System.out.printf("The numbers that add to %d are at indices %d %d", target, indices[0] + 1, indices[1] + 1);
        } else {
            System.out.println("Could not find a Solution");


        }
    }
}
