package second.ds.linkedlist;

import java.util.HashSet;

public class DetectAndRemoveCycle_3 {

    public static void main(String[] args) {

        SingleNode head = SinglyLinkedListUtil.getCircularSinglyLinkedList();

        // linked list with cycle cant be printed normally.
        // will cause loop to run infinitely.

        System.out.println(detectCycle(head));

        System.out.println("cycle length is : "+findLengthOfCycle(head));

        removeCycle(head);

        SinglyLinkedListUtil.traverse(head);
    }


    private static boolean detectCycle(SingleNode head) {

        SingleNode current = head;

        HashSet<SingleNode> nodes = new HashSet<>();

        boolean cycleExists = false;

        // while(true) will also work here.
        while (current != null) {
            if (nodes.contains(current)) {
                cycleExists = true;
                break;
            }
            nodes.add(current);
            current = current.next;
        }
        return cycleExists;
    }

    private static void removeCycle(SingleNode head) {

        HashSet<SingleNode> nodes = new HashSet<>();
        SingleNode current = head, prev = head;
        while (!nodes.contains(current)) {
            nodes.add(current);
            prev = current;
            current = current.next;
        }

        // current is the pivot element in cycle.
        // current se pehle waale node ko null point karwa do.
        prev.next = null;
    }


    private static int findLengthOfCycle(SingleNode current) {
        HashSet<SingleNode> nodes = new HashSet<>();

        while (!nodes.contains(current)) {
            nodes.add(current);
            current = current.next;
        }

        System.out.println("cycle exists at node : " + current.data);

        int length = 1;

        SingleNode iter = current.next;
        SingleNode pivot = current;

        while (iter != pivot) {
            length = length + 1;
            iter = iter.next;
        }

        return length;
    }


}
