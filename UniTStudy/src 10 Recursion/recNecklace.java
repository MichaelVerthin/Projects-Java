public class recNecklace {
    public static void main(String[] args) {
        System.out.println("For call necklace(1), result is " + necklace(1));
        System.out.println("For call necklace(2), result is " + necklace(2));
        System.out.println("For call necklace(3), result is " + necklace(3));
        System.out.println("For call necklace(4), result is " + necklace(4));
        System.out.println("For call necklace(6), result is " + necklace(6));
        System.out.println("For call necklace(7), result is " + necklace(7));
        System.out.println("For call necklace(8), result is " + necklace(8));

    }

    public static int necklace(int n) {
        if (n == 1 || n == 2)
            return n;
        return necklace(n - 1) + necklace(n - 2);
    }
}
