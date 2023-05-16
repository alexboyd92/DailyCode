package src;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        menu();


    }
    public static void menu(){
        Scanner userInput= new Scanner(System.in);
        System.out.println("""
                Please choose which to run
                1) Two sum problem\s
                2) Parenthesis generator
                3) Add two Numbers
                4) Palindrome number checking
                5) Remove duplicate integeres from array""");
        int selection = userInput.nextInt();
        switch (selection) {
            case 1 -> twoSum.twoSum();
            case 2 -> ParenthesesGenerator.getResult();
            case 3 -> AddTwoNumbers.getInput();
            case 4 -> PalindromeNumber.getinput();
            case 5-> RemoveDup.getArray();
            default -> System.out.println("No choice matches selection");
        }
        userInput.close();

    }
}

