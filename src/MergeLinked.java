package src;

import java.util.Arrays;
import java.util.Scanner;

public class MergeLinked {
    public static LinkList merge(LinkList.LinkNode list1, LinkList.LinkNode List2) {
        LinkList merged = new LinkList();
        return merged;
    }

    public static void getInput() {
        Scanner userinput = new Scanner(System.in);
        String dirtyInput;
        String[] splitInput;
        int[] arrayOne;
        int[] arrayTwo;
        System.out.println("Please enter first list of numbers separated by commas Ex 1,2,3");
        dirtyInput = userinput.next();
        splitInput = dirtyInput.split(",");
        arrayOne = fillArray(splitInput);

        System.out.println(Arrays.toString(arrayOne));
        if (arrayOne != null) {
            System.out.println("Enter Second array separated by commas EX 1,2,3");
            dirtyInput = userinput.next();
            splitInput = dirtyInput.split(",");
            arrayTwo = fillArray(splitInput);
            System.out.println(Arrays.toString(arrayTwo));

        }


    }

    public static int[] fillArray(String[] input) {
        int[] toFill = new int[input.length];
        for (int i = 0; i < input.length; i++) {

            try {
                toFill[i] = Integer.parseInt(input[i]);
                return toFill;

            } catch (Exception e) {
                System.out.println("Improper formatting");
                return null;

            }

        }
        return null;
    }
}
