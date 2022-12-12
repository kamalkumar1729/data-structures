package first.ds.linkedlist;

public class Reversal {
    public static void main(String[] args) {
        SingleNode head2 = LinkedList.getSinglyLinkedList();
        SingleNode head = reverse(head2);


        while (head != null) {
            System.out.print(head.Data() + "-");
            head = head.Next();
        }
    }

    private static SingleNode reverse(SingleNode head) {

        SingleNode current = head, previous = null, next = null;

        while (current != null) {

            // save the next node
            next = current.Next();


            // set current node's pointer to previous
            current.setNext(previous);


            // current is prev now
            previous = current;


            // move ahead .. Update the variable (i++ etc )
            current = next;
        }
        return previous;
        //head = previous;
        //return head;
    }



    private static SingleNode reverse2(SingleNode head) {

        /* non reversed list */
        /* should be first statement */
        SingleNode remainder = head.Next();

        /* reversed and head pointing to same node.*/

        SingleNode reversed = head;
        reversed.setNext(null);

        // SingleNode current;
        while (remainder != null ) {
           SingleNode current = remainder;
            remainder = remainder.Next();

            current.setNext(reversed);
            reversed = current;
        }
        return reversed;
    }
}
