package dlinkedlist;

class DoubleNode {
    private Integer data;
    private DoubleNode next;
    private DoubleNode prev;

    DoubleNode(Integer data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    void setNext(DoubleNode next) {
        this.next = next;
    }

    void setPrev(DoubleNode prev) {
        this.prev = prev;
    }

    DoubleNode Next() {
        return next;
    }

    DoubleNode Prev() {
        return prev;
    }

    Integer Data() {
        return data;
    }
}
