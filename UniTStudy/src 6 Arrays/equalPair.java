public class equalPair {
    public static boolean allPairsEqual(int[] a) {
        /* Complete your code here */
        for (int i = 0; i < a.length / 2; i++)
            if (a[i] != a[a.length - 1 - i])
                return false;
        return true;
    }

    public static int what(int[] a) {

        double x = 0;

        for (int i = 0; i < a.length; i++)

            x = (x + a[i]) / 2 + Math.abs((x - a[i]) / 2);

        return (int) x;

    }

    public static void main(String[] args) {
        int[] a = { 3, 10, 4, 9, 1 };
        System.out.println(what(a));
        // System.out.println("For call allPairsEqual({7,-2,3,9,3,-2,7}), result is "
        // + allPairsEqual(new int[] { 7, -2, 3, 9, 3, -2, 7 }));

        // System.out.println("For call allPairsEqual({7,-2,3,9,3,2,7}), result is "
        // + allPairsEqual(new int[] { 7, -2, 3, 9, 3, 2, 7 }));

        // System.out.println("For call allPairsEqual({7, 3, 1, 1, 3, 7}), result is "
        // + allPairsEqual(new int[] { 7, 3, 1, 1, 3, 7 }));
    }
}
