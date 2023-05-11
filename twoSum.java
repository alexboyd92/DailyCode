//Description givien an array of intergets return the two indencies whos sum is eqaul to a given target assuming that each input has one solution
import java.util.Scanner;
class TwoSum {

    //Brute force  O(n^2)
    private static int[] bruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

public static void main(String[] args){
Scanner input = new Scanner(System.in);
int arraySize= input.nextInt;
int [] nums = new int[arraySize];
//fill the array
 for(int i = 0; i < arraySize; i++) {
            nums[i] = input.nextInt();
        }
 //get the target number 
   int target = input.nextInt();
// close the scanner
input.close();
//make a new array by calling the brute force class  should return a int array
int[] indicies =bruteForce(nums, target);
// check if the indencies array is of lenght 2 if there are more or less then a solution cant be found 
if (indices.length == 2) {
            System.out.println("the numbers that add ot " +target+ "are"+indices[0] + " " + indices[1]);
        } else {
            System.out.println("Could not find a soulution");




}
