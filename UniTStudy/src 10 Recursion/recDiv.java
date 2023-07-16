public class recDiv {
    public static void main(String[] args) {
        System.out.println("For call div(20,4), result is " + div(20, 4));
        System.out.println("For call div(18, 5), result is " + div(18, 5));
    }

    public static int div(int num1, int num2) {
        if (num1 < num2)
            return 0;
        return 1 + div(num1 - num2, num2);
    }
}
