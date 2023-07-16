public class recOdd {
    public static void main(String[] args) {

        System.out.println("For call odd(123), result is " + odd(123));
        System.out.println("For call odd(1000), result is " + odd(1000));
        System.out.println("For call odd(9759), result is " + odd(9759));
        System.out.println("For call odd(21212), result is " + odd(21212));
    }

    public static int odd(int n) {
        if (n <= 0)
            return 0;
        else if ((n % 10) % 2 != 0)
            return 1 + odd(n / 10);
        else
            return odd(n / 10);
    }

    public static int odd2(int num) {
        if (num < 10)
            return num % 2;
        return num % 10 % 2 + odd(num / 10);
    }
}
