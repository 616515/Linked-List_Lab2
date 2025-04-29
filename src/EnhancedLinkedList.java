public class EnhancedLinkedList extends BasicLinkedList {
    public int getLast() {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        MyNode current = head;
        while (current.getNextNode() != null) {
            current = current.getNextNode();
        }
        return current.getElement();
    }

    public void addLast(int x) {
        MyNode newNode = new MyNode(x);
        if (head == null) {
            head = newNode;
        } else {
            MyNode current = head;
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
        }
    }

    public void removeLast() {
        if (head == null) {
            return;
        }
        if (head.getNextNode() == null) {
            head = null;
        } else {
            MyNode current = head;
            while (current.getNextNode().getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(null);
        }
    }

    public boolean search(int x) {
        MyNode current = head;
        while (current != null) {
            if (current.getElement() == x) {
                return true;
            }
            current = current.getNextNode();
        }
        return false;
    }

    public void remove(int x) {
        if (head == null) {
            System.out.println("Warning: Element not found");
            return;
        }
        if (head.getElement() == x) {
            head = head.getNextNode();
            return;
        }
        MyNode prev = head;
        MyNode current = head.getNextNode();
        while (current != null) {
            if (current.getElement() == x) {
                prev.setNextNode(current.getNextNode());
                return;
            }
            prev = current;
            current = current.getNextNode();
        }
        System.out.println("Warning: Element not found");
    }
}