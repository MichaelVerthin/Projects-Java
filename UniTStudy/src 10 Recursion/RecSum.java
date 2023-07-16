public class RecSum {
    public static void main(String[] args) {
        System.out.println("For call sum(1), result is " + sum(1));
        System.out.println("For call sum(2), result is " + sum(2));
        System.out.println("For call sum(4), result is " + sum(4));
    }

    public static int sum(int num) {
        if (num == 1)
            return 1;
        return num + sum(num - 1);
    }
}
