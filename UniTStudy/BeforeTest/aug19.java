public class aug19 {
    public static void main(String[] args) {
        int[] a = { 5, 4, 2, 3, 1 };
        System.out.println(isSum(a, 8));
    }

    public static boolean isSum(int[] a, int num) {
        return isSumHelper(a, num, 0, 0, Integer.MAX_VALUE);
    }

    private static boolean isSumHelper(int[] a, int num, int sum, int index, int prev) {
        if (sum == num)
            return true;
        if (sum > num || index >= a.length)
            return false;
        if (a[index] > prev)
            return isSumHelper(a, num, sum + a[index], index + 2, a[index]);
        return isSumHelper(a, num, sum, index + 1, prev) || isSumHelper(a, num, sum + a[index], index + 1, a[index]);
    }

}
