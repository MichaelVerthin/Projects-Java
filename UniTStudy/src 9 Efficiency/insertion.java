public class insertion { // O(n^2)
    public static void insertionSort(int[] a) {
        int j;
        for (int i = 1; i < a.length; i++) {
            int newest = a[i];
            for (j = i - 1; j >= 0 && a[j] > newest; j--)
                a[j + 1] = a[j];
            a[j + 1] = newest;
        }
    }
}
