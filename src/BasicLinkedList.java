public class BasicLinkedList {
    protected MyNode head;

    public BasicLinkedList() {
        head = null;
    }

    public void addFirst(int x) {
        MyNode newNode = new MyNode(x);
        newNode.setNextNode(head);
        head = newNode;
    }

    public void removeFirst() {
        if (head != null) {
            head = head.getNextNode();
        }
    }

    public int getFirst() {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        return head.getElement();
    }

    public void printAll() {
        MyNode current = head;
        while (current != null) {
            System.out.print(current.getElement() + " ");
            current = current.getNextNode();
        }
        System.out.println();
    }

    public int getSize() {
        int count = 0;
        MyNode current = head;
        while (current != null) {
            count++;
            current = current.getNextNode();
        }
        return count;
    }
}

