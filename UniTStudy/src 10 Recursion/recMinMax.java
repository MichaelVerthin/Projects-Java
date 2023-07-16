public class recMinMax {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
    }

    public int max(int[] a) {
        return max(a, 0);
    }

    public static int max(int[] a, int i) {
        if (i == a.length - 1)
            return a[a.length - 1];
        int currentMax = max(a, i + 1);
        if (a[i] < currentMax)
            return currentMax;
        else
            return a[i];
    }

    public static int recMin(int[] a, int i) {
        if (i == a.length - 1)
            return a.length - 1;
        int currMinInd = recMin(a, i + 1);
        if (a[i] > a[currMinInd])
            return currMinInd;
        else
            return i;
    }

    // public static int vlad(int num) {
    // if (num == 0)
    // return 0;
    // if (num % 2 == 0)
    // return 1 + vlad(num / 10);
    // return vlad(num / 10);
    // }

    // public static boolean vladBool(int num) {
    // if (num == 0)
    // return true;
    // return num % 2 == 0 && vladBool(num / 10);
    // }

    // public static int vladArr(int[] a, int len) {
    // if (len <= 0)
    // return 0;
    // if (a[len - 1] % 2 == 0)
    // return 1 + vladArr(a, len - 1);
    // return vladArr(a, len - 1);
    // }
}
