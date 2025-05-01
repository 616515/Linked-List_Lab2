public class Main {
    public static void main(String[] args) {
        BasicLinkedList BasicLinkedList1 = new BasicLinkedList();
        BasicLinkedList1.addFirst(1);
        BasicLinkedList1.addFirst(2);
        BasicLinkedList1.addFirst(3);
        BasicLinkedList1.addFirst(4);
        BasicLinkedList1.printAll();
        System.out.println(BasicLinkedList1.getSize());
        BasicLinkedList1.removeFirst();
        BasicLinkedList1.printAll();
        System.out.println(BasicLinkedList1.getSize());
        System.out.println(BasicLinkedList1.getFirst());
        EnhancedLinkedList EnhancedLinkedList1 = new EnhancedLinkedList();
        EnhancedLinkedList1.addFirst(1);
        EnhancedLinkedList1.addFirst(2);
        EnhancedLinkedList1.remove(1);
        EnhancedLinkedList1.printAll();
        EnhancedLinkedList1.remove(2);
        EnhancedLinkedList1.printAll();

        EnhancedLinkedList1.addFirst(1);
        EnhancedLinkedList1.addFirst(2);
        EnhancedLinkedList1.addFirst(3);
        EnhancedLinkedList1.addFirst(4);
        EnhancedLinkedList1.printAll();
        EnhancedLinkedList1.remove(3);
        EnhancedLinkedList1.printAll();
    }
}