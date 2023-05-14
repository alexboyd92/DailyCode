package src;

import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int reversed=0;
        if(x<0)
            return false;

        int hold =x;
        int digit;
        while(x!=0){
            digit= x%10;
            reversed = reversed * 10 + digit;
            x/=10;

        }
        return reversed == hold;


    }
    public static void getinput(){
        Scanner userInput=new Scanner(System.in);
        System.out.println("Please enter an integer");
        int num=userInput.nextInt();
        System.out.println(isPalindrome(num));

    }

}
