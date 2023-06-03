package src;


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
        LinkList listOne = new LinkList();
        LinkList listTwo = new LinkList();
        System.out.println("Please enter first list of numbers separated by commas Ex 1,2,3");
        dirtyInput = userinput.next();
        splitInput = dirtyInput.split(",");
        arrayOne = fillArray(splitInput);

        if (arrayOne != null) {
            System.out.println("Enter Second array separated by commas EX 1,2,3");
            dirtyInput = userinput.next();
            splitInput = dirtyInput.split(",");
            arrayTwo = fillArray(splitInput);
            if (arrayTwo != null) {
               LinkList.fillList(listOne,arrayOne);
                for (int y:arrayTwo
                     ) {LinkList.insert(listTwo,y);

                }
                LinkList.printList(listOne);
                LinkList.printList(listTwo);
               listTwo= merge(listOne.head,listTwo.head);
               System.out.println("Result:");
               LinkList.printList(listTwo);

            }


        }


    }

    public static int[] fillArray(String[] input) {
        int[] toFill = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            if (toFill != null) {
                try {
                    toFill[i] = Integer.parseInt(input[i]);


                } catch (Exception e) {
                    System.out.println("Improper formatting");
                    toFill = null;

                }
            }

        }
        return toFill;
    }
}
