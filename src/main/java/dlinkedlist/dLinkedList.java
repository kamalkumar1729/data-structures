package dlinkedlist;

public class dLinkedList {
    public static void main(String[] args) {
        DoubleNode head = getDoubleLinkedList();
        traverseDoubleLinkedList(head);
    }







    private static void traverseDoubleLinkedList(DoubleNode head) {
        if (head != null){
            DoubleNode iter = head;
            while (iter != null) {
                System.out.print(iter.Data()+"-");
                iter = iter.Next();
            }
        } else {
            System.out.println("Empty Double Linked List");
        }
    }

    private static DoubleNode getDoubleLinkedList() {
        DoubleNode a = new DoubleNode(10);
        DoubleNode b = new DoubleNode(20);
        DoubleNode c = new DoubleNode(30);
        DoubleNode d = new DoubleNode(40);
        DoubleNode e = new DoubleNode(50);
        DoubleNode f = new DoubleNode(60);
        DoubleNode g = new DoubleNode(70);
        DoubleNode h = new DoubleNode(80);
        DoubleNode i = new DoubleNode(90);
        DoubleNode j = new DoubleNode(100);
        DoubleNode k = new DoubleNode(110);
        DoubleNode l = new DoubleNode(120);
        DoubleNode m = new DoubleNode(130);
        DoubleNode n = new DoubleNode(140);
        DoubleNode o = new DoubleNode(150);
        DoubleNode p = new DoubleNode(160);


        a.setNext(b);
        b.setNext(c);b.setPrev(a);
        c.setNext(d);c.setPrev(b);
        d.setNext(e);d.setPrev(c);
        e.setNext(f);e.setPrev(d);
        f.setNext(g);f.setPrev(e);
        g.setNext(h);g.setPrev(f);
        h.setNext(i);h.setPrev(g);
        i.setNext(j);i.setPrev(h);
        j.setNext(k);j.setPrev(i);
        k.setNext(l);k.setPrev(j);
        l.setNext(m);l.setPrev(k);
        m.setNext(n);m.setPrev(l);
        n.setNext(o);n.setPrev(m);
        o.setNext(p);o.setPrev(n);
                     p.setPrev(o);

        return a;
    }
}
