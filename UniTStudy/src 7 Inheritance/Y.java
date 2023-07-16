public class Y extends X {
    public Y() {
        System.out.print("Y1,");
    }

    public Y(int num) {
        this(num, num);
        System.out.print("Y2,");
    }

    public Y(int num1, int num2) {
        super(num1, num2);
        System.out.print("Y3,");
    }
}