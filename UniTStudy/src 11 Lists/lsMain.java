public class lsMain {
    public static void main(String[] args) {
        CircularIntList l1 = new CircularIntList();

        l1.addToEnd(new IntNode(1));
        System.out.println("After adding one node with value 1, list is:");
        l1.printList();

        l1.addToEnd(new IntNode(2));
        l1.addToEnd(new IntNode(3));
        l1.addToEnd(new IntNode(4));
        l1.addToEnd(new IntNode(5));

        System.out.println("\nAfter adding 2,3,4,5 nodes, list is:");
        l1.printList();
    }
}
