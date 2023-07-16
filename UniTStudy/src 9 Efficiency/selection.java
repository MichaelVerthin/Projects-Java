public class selection { // O(n^2)
    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int smallest = 1;
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
}
