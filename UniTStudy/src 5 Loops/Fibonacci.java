public class Fibonacci {
    public static void fibonacci(int n) {
        int num1 = 1, num2 = 1, num3;
        System.out.print(num1);
        if (n == 1)
            return;
        System.out.print(", " + num2);
        for (int i = 1; i <= n - 2; i++) {
            num3 = num1 + num2;
            System.out.print(", " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
