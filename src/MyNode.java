public class MyNode {
    private int element;
    private MyNode next;

    public MyNode(int x) {
        element = x;
        next = null;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int x) {
        element = x;
    }

    public MyNode getNextNode() {
        return next;
    }

    public void setNextNode(MyNode node) {
        next = node;
    }
}