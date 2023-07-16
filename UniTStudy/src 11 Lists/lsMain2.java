public class lsMain2 {
    public static void main(String[] args) {
        IntListTwo l1 = new IntListTwo();
        IntNodeTwo n1 = new IntNodeTwo(7);
        l1.addToEnd(n1);
        IntNodeTwo n2 = new IntNodeTwo(3);
        l1.addToEnd(n2);
        IntNodeTwo n3 = new IntNodeTwo(2);
        l1.addToEnd(n3);
        IntNodeTwo n4 = new IntNodeTwo(4);
        l1.addToEnd(n4);
        IntNodeTwo n5 = new IntNodeTwo(3);
        l1.addToEnd(n5);

        System.out.println("List is: {7,3,2,4,3}, diff(3) return " + l1.diff(3));
        System.out.println("List is: {7,3,2,4,3}, diff(5) return " + l1.diff(5));
        System.out.println("List is: {7,3,2,4,3}, diff(6) return " + l1.diff(6));
    }
}
