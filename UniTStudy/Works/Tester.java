package UniTStudy.Works;

public class Tester {
    public static void main(String[] args) {
        Z x1 = new X(3, 3);
        X x2 = new X(4, 4);
        Y y1 = new Y(3, 2);
        Y y2 = new Y(3, 2);

        // System.out.println(x1.foo(3));
        // System.out.println(!x1.foo(2));
        // System.out.println(x2.foo(4));
        // System.out.println(!y1.foo(5));
        // System.out.println(y1.foo(1));
        // System.out.println(!y2.foo(6));
        // System.out.println(y2.foo(1));
        System.out.println(y1.equals(y2));
    }
}
