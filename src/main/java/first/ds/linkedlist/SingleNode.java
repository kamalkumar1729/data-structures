package first.ds.linkedlist;

class SingleNode {

    private Integer data;
    private SingleNode next;

    public SingleNode(Integer dd) {
        data = dd;
    }

    public void setNext(SingleNode node) {
        next = node;
    }

    public SingleNode Next() {
        return next;
    }

    public Integer Data() {
        return data;
    }

    public void setData(Integer d) {
        data = d;
    }

}
