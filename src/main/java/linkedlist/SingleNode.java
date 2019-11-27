package linkedlist;

class SingleNode {

    private Integer data;
    private SingleNode next;

    SingleNode(Integer data) {
        this.data = data;
        this.next = null;
    }

    void setNext(SingleNode next) {
        this.next = next;
    }

    SingleNode getNext() {
        return next;
    }

    Integer getData() {
        return data;
    }

}
