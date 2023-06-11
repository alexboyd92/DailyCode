package src;

import java.util.Scanner;

public class ReverseInt {


    public static void getInput() {
        System.out.println("Please enter an integer");
        Scanner input = new Scanner(System.in);
        System.out.println(reverse(input.nextInt()));

        input.close();
    }

    public static int reverse(int x)

    {
        int rev = 0;
        while (x != 0) {
        int pop = x % 10;
        x /= 10;
        if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
        if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
        rev = rev * 10 + pop;
    }

        return rev;
    }

}
