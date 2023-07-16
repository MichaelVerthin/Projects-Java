public class recStr {

    public static void main(String[] args) {
        System.out.println("For call strings(1), result is " + strings(1));
        System.out.println("For call strings(2), result is " + strings(2));
        System.out.println("For call strings(3), result is " + strings(3));
    }

    public static int strings(int n) {
        return strings(n, "");
    }

    private static int strings(int n, String s) {
        if (n == 0)
            return 1;
        else
            return strings(n - 1, s + 'a') + strings(n - 1, s + 'b') + strings(n - 1, s + 'c')
                    + strings(n - 1, s + 'd');
    }
}
