package linkedlist;

public class LinkedList {

    public static void main(String[] args) {

        SingleNode head = getSinglyLinkedList();

        traverseLinkedList(head);
        deleteNodeAtIndex(head,0);
        System.out.println();
        traverseLinkedList(head);
    }

    private static void traverseLinkedList(SingleNode head) {
        if (head != null) {
            SingleNode current = head;
            while (current != null) {
                System.out.print(current.getData() + " ");
                current = current.getNext();
            }
        } else {
            System.out.println("Linked list is empty.");
        }
    }

    private static void deleteNodeAtIndex(SingleNode head, int index) {
        if (head != null) {
            SingleNode iter = head;
            for (int i=0; i < index-1 ; i++) {
                iter = iter.getNext();
            }
            SingleNode beforeDelNode = iter;
            SingleNode delNode = iter.getNext();
            beforeDelNode.setNext(delNode.getNext());
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
