public class recSelectionSort {
    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[smallest])
                    smallest = j;
            if (smallest != i) {
                int temp = a[smallest];
                a[smallest] = a[i];
                a[i] = temp;
            }
        }
    }

    private static void selection(int[] a, int i) {
        if (i == a.length - 1)
            return;
        int smallest = recMinMax.recMin(a, i);
        if (smallest != i) {
            int temp = a[smallest] = a[i];
            a[i] = temp;
        }
    }
}
