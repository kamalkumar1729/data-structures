package linkedlist;

public class LinkedList {

    public static void main(String[] args) {

        SingleNode head = getSinglyLinkedList();

        System.out.println(isValuePresent(head,300));

       // traverseLinkedList(head);
      //  deleteNodeAtIndex(head,0);
       // System.out.println();
       // traverseLinkedList(head);
    }

    private static void traverseLinkedList(SingleNode head) {
        if (head != null) {
            SingleNode iterator = head;
            while (iterator != null) {
                System.out.print(iterator.Data() + " ");
                iterator = iterator.Next();
            }
        } else {
            System.out.println("Linked list is empty.");
        }
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

    private static void deleteNodeWithValue(SingleNode head, int value) throws Exception {
        if (head != null) {
            SingleNode iterator = head;
            while (iterator != null) {
                if (iterator.Data() == value)
                    break;
                iterator = iterator.Next();
            }
        } else {
            throw new Exception("Head is Null");
        }
    }

    private static SingleNode getSinglyLinkedList() {

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
        r.setNext(s);

        return head;
    }

}
