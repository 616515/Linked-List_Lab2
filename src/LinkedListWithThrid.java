public class LinkedListWithThrid extends BasicLinkedList {
    public int getThird() {
        MyNode current = head;
        int count = 0;
        while (current != null && count < 2) {
            current = current.getNextNode();
            count++;
        }
        if (current == null) {
            throw new IndexOutOfBoundsException("No third element");
        }
        return current.getElement();
    }

    public void addThird(int x) {
        MyNode newNode = new MyNode(x);
        if (head == null) {
            head = newNode;
            return;
        }
        MyNode current = head;
        int count = 0;
        while (current.getNextNode() != null && count < 1) {
            current = current.getNextNode();
            count++;
        }
        newNode.setNextNode(current.getNextNode());
        current.setNextNode(newNode);
    }

    public void removeThird() {
        if (head == null) {
            return;
        }
        MyNode first = head;
        MyNode second = first.getNextNode();
        if (second == null) {
            return;
        }
        MyNode third = second.getNextNode();
        if (third == null) {
            return;
        }
        second.setNextNode(third.getNextNode());
    }
}