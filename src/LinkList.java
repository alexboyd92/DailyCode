package src;


public class LinkList {

    LinkNode head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
  static class LinkNode {

        int value;
        LinkNode next;

        // Constructor
         LinkNode(int x) {
            value = x;
            next = null;
        }
    }

        public static LinkList insert(LinkList list, int value) {
            // Create a new node with given data
            LinkNode new_node = new LinkNode(value);


            // If the Linked List is empty,
            // then make the new node as head
            if (list.head == null) {
                list.head = new_node;
            } else {
                // Else traverse till the last node
                // and insert the new_node there
                LinkNode last = list.head;
                while (last.next != null) {
                    last = last.next;
                }

                // Insert the new_node at last node
                last.next = new_node;
            }

            // Return the list by head
            return list;
        }

        public static void printList(LinkList list) {
            LinkNode currNode = list.head;

            System.out.print("LinkedList: ");

            // Traverse through the LinkedList
            while (currNode != null) {
                // Print the data at current node
                if(currNode.next==null){
                    System.out.println(currNode.value);
                }else {
                System.out.print(currNode.value + ",");}

                // Go to next node
                currNode = currNode.next;
            }

        }
        public static void fillList(LinkList list,int[] intArray){
            for (int x :
                    intArray) {
                LinkList.insert(list, x);


            }
        }



    }




