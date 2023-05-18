package src;

/*
* You are given two non-empty linked lists representing two non-negative integers.
* The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
* Example
* 352+252 would be num1=[2,5,3,] num2 =[2,5,2]
*
* */
class LinkNode {
    int value;
    LinkNode next;

    LinkNode() {
    }

    LinkNode(int value) {
        this.value = value;
    }

    LinkNode(int value, LinkNode next) {
        this.value = value;
        this.next = next;
    }
}

public class AddTwoNumbers {
    public LinkNode addNums(LinkNode num1, LinkNode num2) {

        LinkNode dummy = new LinkNode(0);
        LinkNode current = dummy;
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
            LinkNode node = new LinkNode(sum % 10); // the value we'll get by moduloing it, will become as new node so. add it to our list
            current.next = node; // curr will point to that new node if we get
            current = current.next; // update the current every time
        }

        return dummy.next;
    }

    //TODO implement putting 3 digit number into linked list (LinkNode) then sending it to addition function  then print out result
    public static void getInput() {
        int number1 = 321;
        int number2 = 252;
        int tempNum;
        LinkNode num1 = new LinkNode();
        LinkNode num2 = new LinkNode();
        System.out.println("Not yet implemented");
    }


}


//create simple linked list of integers to use;
