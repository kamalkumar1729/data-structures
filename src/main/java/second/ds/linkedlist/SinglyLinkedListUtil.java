package second.ds.linkedlist;

public class SinglyLinkedListUtil {

    private static String num1 = "";

    public static void main(String[] args) {
        SingleNode head = getSinglyLinkedList();
    }


    public static void traverse(SingleNode head) {
        while (head != null) {
            System.out.print(head.data + " - ");
            head = head.next;
        }
        System.out.println();
    }

    private static void traverseRecursive(SingleNode head) {
        if (head != null) {
            traverseRecursive(head.next);
            System.out.print(head.data + " - ");
        }
        System.out.println();
    }



    public static SingleNode getSinglyLinkedList() {

        SingleNode node1 = new SingleNode(34);
        SingleNode node2 = new SingleNode(23);
        SingleNode node3 = new SingleNode(30);
        SingleNode node4 = new SingleNode(47);
        SingleNode node5 = new SingleNode(15);
        SingleNode node6 = new SingleNode(67);
        SingleNode node7 = new SingleNode(79);
        SingleNode node8 = new SingleNode(98);
        SingleNode node9 = new SingleNode(69);
        SingleNode node10 = new SingleNode(10);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next= null;

        return node1;
    }


    public static SingleNode getSortedSinglyLinkedList() {

        SingleNode node1 = new SingleNode(34);
        SingleNode node2 = new SingleNode(35);
        SingleNode node3 = new SingleNode(36);
        SingleNode node4 = new SingleNode(36);
        SingleNode node5 = new SingleNode(36);
        SingleNode node6 = new SingleNode(39);
        SingleNode node7 = new SingleNode(40);
        SingleNode node8 = new SingleNode(41);
        SingleNode node9 = new SingleNode(41);
        SingleNode node10 = new SingleNode(43);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next= null;

        return node1;
    }


    public static SingleNode getCircularSinglyLinkedList() {

        SingleNode node1 = new SingleNode(34);
        SingleNode node2 = new SingleNode(23);
        SingleNode node3 = new SingleNode(30);
        SingleNode node4 = new SingleNode(47);
        SingleNode node5 = new SingleNode(15);
        SingleNode node6 = new SingleNode(67);
        SingleNode node7 = new SingleNode(79);
        SingleNode node8 = new SingleNode(98);
        SingleNode node9 = new SingleNode(69);
        SingleNode node10 = new SingleNode(10);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;

        // loop exists here.
        node10.next= node3;

        return node1;
    }

    public static SingleNode getPalindromicSinglyLinkedList() {

        SingleNode node1 = new SingleNode(34);
        SingleNode node2 = new SingleNode(23);
        SingleNode node3 = new SingleNode(30);
        SingleNode node4 = new SingleNode(47);
        SingleNode node5 = new SingleNode(15);
        SingleNode node6 = new SingleNode(15);
        SingleNode node7 = new SingleNode(47);
        SingleNode node8 = new SingleNode(30);
        SingleNode node9 = new SingleNode(23);
        SingleNode node10 = new SingleNode(34);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next= null;

        return node1;
    }


    public static SingleNode getNumber1() {

        // 4307557034

        SingleNode node1 = new SingleNode(4);
        SingleNode node2 = new SingleNode(3);
        SingleNode node3 = new SingleNode(0);
        SingleNode node4 = new SingleNode(7);
        SingleNode node5 = new SingleNode(5);
        SingleNode node6 = new SingleNode(5);
        SingleNode node7 = new SingleNode(7);
        SingleNode node8 = new SingleNode(0);
        SingleNode node9 = new SingleNode(3);
        SingleNode node10 =new SingleNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next= null;

        return node1;
    }


    public static SingleNode getNumber2() {

        // 32341

        SingleNode node1 = new SingleNode(3);
        SingleNode node2 = new SingleNode(2);
        SingleNode node3 = new SingleNode(3);
        SingleNode node4 = new SingleNode(4);
        SingleNode node5 = new SingleNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        return node1;
    }

}
