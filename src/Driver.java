package src;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner userInput= new Scanner(System.in);
        System.out.println("Please choose which to run\n" +
                "1) Two sum problem \n" +
                "2) Parenthesis generator" );
        int selection = userInput.nextInt();
        switch(selection){
            case 1:
                twoSum.twoSum();
                break;
            case 2:
                ParenthesesGenerator.getResult();
                break;
            default:
                System.out.println("No choice matches selection");
        }
        userInput.close();




    }
}

