package src;


import java.util.Arrays;
import java.util.Scanner;


public class MergeLinked {
    public static LinkList.LinkNode merge(LinkList.LinkNode l1, LinkList.LinkNode l2) {
        LinkList.LinkNode head = new LinkList.LinkNode(0);
        LinkList.LinkNode handler = head;
        while(l1 != null && l2 != null) {
            if (l1.value <= l2.value) {
                handler.next = l1;
                l1 = l1.next;
            } else {
                handler.next = l2;
                l2 = l2.next;
            }
            handler = handler.next;
        }

        if (l1 != null) {
            handler.next = l1;
        } else if (l2 != null) {
            handler.next = l2;
        }

        return head.next;
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
        Arrays.sort(arrayOne);
        if (arrayOne != null) {
            System.out.println("Enter Second array separated by commas EX 1,2,3");
            dirtyInput = userinput.next();
            splitInput = dirtyInput.split(",");
            arrayTwo = fillArray(splitInput);
            Arrays.sort(arrayTwo);
            if (arrayTwo != null) {
               LinkList.fillList(listOne,arrayOne);
               LinkList.fillList(listTwo,arrayTwo);
               listTwo.head= merge(listOne.head,listTwo.head);
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
