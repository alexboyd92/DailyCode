package src;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Options[]menuOptions  = new Options[5];
        menuOptions[0] =new Options("Two sum problem","test description 1");
        menuOptions[1] =new Options("Parentheses generator","test description 2");
        menuOptions[2] =new Options("Add two Numbers","test description 3");
        menuOptions[3] =new Options("Palindrome number checking","test description 4");
        menuOptions[4] =new Options("Remove duplicate integers from array","test description 5");
        new GuiMenu(menuOptions);
       /// menu();


    }


    public static void menu(){
        Scanner userInput= new Scanner(System.in);
        System.out.println("""
                Please choose which to run
                1) Two sum problem\s
                2) Parentheses generator
                3) Add two Numbers
                4) Palindrome number checking
                5) Remove duplicate integers from array""");
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



