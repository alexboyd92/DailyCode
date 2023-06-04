package src;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Options[] menuOptions = new Options[7];
        menuOptions[0] = new Options("Two sum problem", " Given an array of integers, return indices of the two " +
                "numbers such that they add up to a specific target."
        );
        menuOptions[1] = new Options("Parentheses generator",
                "Given a number (n) pairs of parentheses generate all combination of well-formed parentheses. ");

        menuOptions[2] = new Options("Add two Numbers", """
                You give two non-empty linked lists representing two non-negative integers.
                The digits are stored in reverse order, and each of their nodes contains a single digit.
                Add the two numbers and return the sum as a linked list.""");

        menuOptions[3] = new Options("Palindrome number checking", """
                Given an integer x, return true if x is a palindrome and false otherwise""");

        menuOptions[4] = new Options("Remove duplicate integers from array",
                "Given an integer array  sorted in non-decreasing order, " +
                        "remove the duplicates in-place such that each unique element appears only once. " +
                        "The relative order of the elements should be kept the same");
        menuOptions[5]= new Options("Longest Palindromic substring",
                "Given a string find the longest substring that is a palindrome");
        menuOptions[6] = new Options("Merge Sorted Linked list", " Given two sorted linked list merge them ."
        );


        if(args.length!=0&&args[0].equals("cli")){
            menu();
        }
        else
            new GuiMenu(menuOptions);
    }


    public static void menu() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("""
                Please choose which to run
                1) Two sum problem\s
                2) Parentheses generator
                3) Add two Numbers
                4) Palindrome number checking
                5) Remove duplicate integers from array
                6) Longest palindromic substring
                7) Merge Sorted Linked List""");
        int selection = userInput.nextInt();
        switch (selection) {
            case 1 -> twoSum.twoSum();
            case 2 -> ParenthesesGenerator.getResult();
            case 3 -> AddTwoNumbers.getInput();
            case 4 -> PalindromeNumber.getinput();
            case 5 -> RemoveDup.getArray();
            case 6 -> LongestPalindrome.cmdImput();
            case 7 -> MergeLinked.getInput();
            default -> System.out.println("No choice matches selection");
        }
        userInput.close();

    }
}



