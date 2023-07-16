public class bubble { // O(n^2)
    public static void bubbleSort(int[] a) {
        for (int i = a.length - 1; i >= 0; i--)
            for (int j = 0; j < i; j++)
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
    }
}
