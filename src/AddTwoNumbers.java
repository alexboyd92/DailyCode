package src;

/*
* You are given two non-empty linked lists representing two non-negative integers.
* The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
* Example
* 352+252 would be num1=[2,5,3,] num2 =[2,5,2]
*
* */


import java.util.Scanner;

public class AddTwoNumbers {


    public static void getInput() {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int result = 0;
        int finalResult = 0;

        System.out.println("Enter an integer");
        number1 = input.nextInt();
        System.out.println("Enter a second integer with the same number of digits as the first number");
        number2 = input.nextInt();
        if (String.valueOf(number1).length() != String.valueOf(number2).length()) {
            System.out.println("The integers must have the same numebr of digits");
        } else {
            LinkList linkedNum1 = new LinkList();
            linkedNum1 = insertNum(linkedNum1, number1);
            LinkList linkedNum2 = new LinkList();
            linkedNum2 = insertNum(linkedNum2, number2);

            LinkList.LinkNode resultNode = addNums(linkedNum1.head, linkedNum2.head);
            while (resultNode != null) {
                result = result * 10 + resultNode.value;
                resultNode = resultNode.next;
            }
            while (result != 0) {
                int digit = result % 10;
                finalResult = finalResult * 10 + digit;
                result /= 10;

            }
            System.out.println("Got: " + finalResult + " From " + number1 + "+" + number2);

        }

    }

    public static LinkList insertNum(LinkList link, int num) {

        while (num != 0) {

            // get last digit from num
            int digit = num % 10;
            link = LinkList.insert(link, digit);
            // remove the last digit from num
            num /= 10;
        }

        return link;

    }

    public static LinkList.LinkNode addNums(LinkList.LinkNode num1, LinkList.LinkNode num2) {

        LinkList.LinkNode dummy = new LinkList.LinkNode(0);
        LinkList.LinkNode current = dummy;
        int carry = 0;

        // while loop will run, until num1 OR num2 not reaches null OR if they both reaches null. But our carry has some value in it.
        while (num1 != null || num2 != null || carry == 1) {
            int sum = 0;
            if (num1 != null) { // adding l1 to our sum & moving l1
                sum += num1.value;
                num1 = num1.next;
            }
            if (num2 != null) { // adding l2 to our sum & moving l2
                sum += num2.value;
                num2 = num2.next;
            }
            sum += carry; // if we have carry then add it into our sum
            carry = sum / 10; // if we get carry, then divide it by 10 to get the carry
            LinkList.LinkNode node = new LinkList.LinkNode(sum % 10); // the value we'll get by moduloing it, will become as new node so. add it to our list
            current.next = node; // curr will point to that new node if we get
            current = current.next; // update the current every time
        }

        return dummy.next;
    }
}
