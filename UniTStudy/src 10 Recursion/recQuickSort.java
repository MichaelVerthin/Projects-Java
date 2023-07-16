public class recQuickSort {

    public static void quickSort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    private static void quickSort(int[] a, int lo, int hi) {
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
