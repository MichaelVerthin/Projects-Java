public class Vlad4 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 }
        };
        int[] a = { 4, 2, 6, 5 };
        int max = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > max)
                max = a[i];
        }
        int len = max;
        for (int i = 0; i < len + 2; i++) {
            for (int j = 0; j < a.length; j++) {
                if (max == -1)
                    System.out.print(a[j]);
                if (a[j] >= max && max > 0)
                    System.out.print("*");
                else if (max > 0)
                    System.out.print(" ");
                if (max == 0)
                    System.out.print("---");
                else
                    System.out.print("  ");
            }
            System.out.println();
            max--;
        }
    }
}
