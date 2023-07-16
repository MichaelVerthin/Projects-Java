public class mar22 {
    public static void main(String[] args) {
        char[][] mat = {
                { 'a', 'c', 'b', 'x', '@', 'a' },
                { 'b', 'x', 'z', 'c', 's', 'a' },
                { '?', 'c', 'd', 'a', 'c', 'd' },
                { 'b', 'c', 'a', '8', 'b', 'b' },
                { 'c', '2', 'x', '+', 'b', 'c' } };
        int[] a = { 2, 4, 5, 3, 5, 1 };
        int[] b = { 1, 1, 1, 2, 2, 2, 2 };
        int[] c = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 2 };
        System.out.println(findDuplicate(a));
        System.out.println(findDuplicate(b));
        System.out.println(findDuplicate(c));
        // System.out.println(lengthPath(mat, "abc"));
        // printDoubleArr(mat);

    }

    public static int lengthPath(char[][] mat, String pattern) {
        return lengthPath(mat, pattern, 0, 0, 0);
    }

    public static int lengthPath(char[][] mat, String pattern, int i, int j, int maxCount) {
        if (!inPattern(mat[i][j], pattern, i))
            return 0;
        char temp = mat[i][j];
        mat[i][j] = ' ';
        int up = 0, down = 0, left = 0, right = 0;
        if (i + 1 < mat.length && inPattern(temp, pattern, 0))
            up = lengthPath(mat, pattern, i + 1, j, maxCount + 1);
        if (i - 1 >= 0 && inPattern(temp, pattern, 0))
            down = lengthPath(mat, pattern, i - 1, j, maxCount + 1);
        if (j + 1 < mat[0].length && inPattern(temp, pattern, i))
            right = lengthPath(mat, pattern, i, j + 1, maxCount + 1);
        if (j - 1 >= 0 && inPattern(temp, pattern, 0))
            left = lengthPath(mat, pattern, i, j - 1, maxCount + 1);
        mat[i][j] = temp;
        int count = Math.max(Math.max(up, down), Math.max(left, right));
        if (count > maxCount)
            maxCount = count;
        return maxCount;
    }

    private static boolean inPattern(char c, String pattern, int index) {
        if (index == pattern.length())
            return false;
        if (c == pattern.charAt(index))
            return true;
        return inPattern(c, pattern, index + 1);
    }

    public static void printDoubleArr(char[][] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i][0] < 0)
                System.out.print("[" + a[i][0]);
            else
                System.out.print("[ " + a[i][0]);
            for (int j = 1; j < a[i].length; j++) {
                if (a[i][j] < 0)
                    System.out.print(", " + a[i][j]);
                else
                    System.out.print(",  " + a[i][j]);
            }
            System.out.println("]");
        }
    }

    // Question 2
    public static int findDuplicate(int[] a) {
        for (int i = a.length - 1; i >= 0; i--)
            for (int j = 0; j < i; j++) {
                if (a[j] == a[j + 1])
                    return a[j];
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        return -1;
    }

    public static void quickSort(int[] a, int lo, int hi) {
        if (lo < hi) {
            int m = partition(a, lo, hi);
            quickSort(a, lo, m - 1);
            quickSort(a, m + 1, hi);
        }
    }

    private static int partition(int[] a, int lo, int hi) {
        int left = lo, right = hi;
        int pivot = a[lo];
        while (left < right) {
            while (left < right && a[left] <= pivot)
                left++;
            while (a[right] > pivot)
                right--;
            if (left < right)
                swap(a, left, right);
        }
        swap(a, lo, right);
        return right;
    }

    private static void swap(int[] a, int left, int right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }
}
