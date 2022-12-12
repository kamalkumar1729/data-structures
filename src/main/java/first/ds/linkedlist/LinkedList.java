package first.ds.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {

    public static void main(String[] args) {

        SingleNode head = getSinglyLinkedList();

        // System.out.println(isValuePresent(head,300));

       // traverseLinkedList(head);
        System.out.println();
        // head = deleteNodeWithKey(head,21);
        // traverseLinkedList(head);
        // System.out.println();
        // System.out.println(getLengthOfLinkedList(head));

        //System.out.println(nthNodeFromEnd(head,5).Data());
       // SingleNode reverse = reverseLinkedList(head);
       // traverseLinkedList(reverse);
        // System.out.println(middleOfLinkedList(head.Next()).Data());

      //  System.out.println(loopExist_Hash(head));
       // System.out.println(loopExist_FastSlowPointer(head));

       // head = reverseRecursive(head);
       // traverseLinkedList(head);

        //  deleteNodeAtIndex(head,0);
       // System.out.println();
       // traverseLinkedList(head);
    }

    private static void traverseLinkedList(SingleNode head) {
        if (head != null) {
            SingleNode iterator = head;
            while (iterator != null) {
                System.out.print(iterator.Data() + "-");
                iterator = iterator.Next();
            }
        } else {
            System.out.println("Linked list is empty.");
        }
    }


    /* Point head = NULL ,linked list is deleted.*/
    private static SingleNode deleteLinkedList(SingleNode head) {
        head.setNext(null);
        return head;
    }

    /* search element recursively in linked list */
    /* GFG/SLL/8 */
    private static boolean isValuePresent(SingleNode head, Integer value) {
        if (head == null)
            return false;
        if (head.Data().equals(value))
            return true;
        else
            return isValuePresent(head.Next(),value);
    }


    /* delete a given key */
        private static SingleNode deleteNodeWithKey(SingleNode head, int value) {
            if (head != null) {
                SingleNode iterator = head;
                SingleNode prev = head;
                /* we need to find the previous node to node to be deleted */
                while (iterator != null) {
                    if (iterator.Data() == value)
                        break;
                    prev = iterator;
                    iterator = iterator.Next();
                }

                /* if head is the node with key */
                if (iterator == head && prev == head) {
                    head = head.Next();
                    return head;
                }

                /* Key not found */
                if (iterator == null)
                    return head;

                /* set prev node to next*/
                prev.setNext(iterator.Next());

                return head;
            } else {
                return head;
            }
        }



    private static Integer getLengthOfLinkedList(SingleNode head) {
        int length = 0;
        if (head != null) {
            SingleNode iterator = head;
            while (iterator != null) {
                length++; iterator = iterator.Next();
            }
        }
        return length;
    }


    /* if elements are even print Right One */

    private static SingleNode middleOfLinkedList(SingleNode head) {
        SingleNode oneStep = head, twoStep = head;
        /* move one pointer 1 step another 2 steps */
        while (twoStep != null && twoStep.Next() != null) {
            oneStep = oneStep.Next();
            twoStep = twoStep.Next().Next();
        }
        return oneStep;
    }

    private static SingleNode nthNodeFromEnd(SingleNode head, int N) {
            if (head != null) {
                SingleNode iter = head;
                int len = getLengthOfLinkedList(head);
                /* now find len-N+1 from the beginning */
                int fromStart = len-N+1;
                for (int i = 1; i < fromStart; i++) iter = iter.Next();
                return iter;
            }
            return head;
    }

    // FIXME : No time for this shit;
    //  Do it later; did;
    //  Maybe Never; did;
    //  DID IT !! On May14,2020
    private static SingleNode reverseLinkedList(SingleNode head) {
        if (head != null) {
            SingleNode iter = head,temp,prev=null;
            while (iter != null) {
                temp = iter.Next();
                iter.setNext(prev);
                prev = iter;
                iter = temp;
            }
            return prev;
        }
        return head;
    }


    private static SingleNode reverseRecursive(SingleNode head) {
        /*one or zero elements */
        if (head == null || head.Next() == null) return head;
        else {
            SingleNode node = reverseRecursive(head.Next());
            node.setNext(head);
            return node;
        }
    }

    private static boolean loopExist_Hash(SingleNode head) {
        Set<SingleNode> traversedNodes = new HashSet<SingleNode>();
        SingleNode iter = head;
        while (iter != null) {
            if (traversedNodes.contains(iter)) {
                System.out.println("loop at "+ iter.Data());
                break;
            } else {
                traversedNodes.add(iter);
                iter = iter.Next();
            }
        }
        return iter != null;
    }


    private static boolean loopExist_FastSlowPointer(SingleNode head) {
        SingleNode slow = head,fast = head;
        while (slow != null && fast != null && fast.Next() != null) {
            slow = slow.Next();
            fast = fast.Next().Next();
            if (fast == slow) break;
        }
        if (fast ==null && slow == null) return false;
        else return true;
    }







    public static SingleNode getSinglyLinkedList() {
        SingleNode head = new SingleNode(21);
        SingleNode a = new SingleNode(22);
        SingleNode b = new SingleNode(23);
        SingleNode c = new SingleNode(24);
        SingleNode d = new SingleNode(25);
        SingleNode e = new SingleNode(26);
        SingleNode f = new SingleNode(27);
        SingleNode g = new SingleNode(28);
        SingleNode h = new SingleNode(29);
        SingleNode i = new SingleNode(30);
        SingleNode j = new SingleNode(31);
        SingleNode k = new SingleNode(32);
        SingleNode l = new SingleNode(33);
        SingleNode m = new SingleNode(34);
        SingleNode n = new SingleNode(35);
        SingleNode o = new SingleNode(36);
        SingleNode p = new SingleNode(37);
        SingleNode q = new SingleNode(38);
        SingleNode r = new SingleNode(39);
        SingleNode s = new SingleNode(40);

        head.setNext(a);
        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(e);
        e.setNext(f);
        f.setNext(g);
        g.setNext(h);
        h.setNext(i);
        i.setNext(j);
        j.setNext(k);
        k.setNext(l);
        l.setNext(m);
        m.setNext(n);
        n.setNext(o);
        o.setNext(p);
        p.setNext(q);
        q.setNext(r);
        //r.setNext(i); // loop in Linked list
        r.setNext(s);
        return head;
    }
}