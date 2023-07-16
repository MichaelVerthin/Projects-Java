import java.util.Scanner;
import java.util.Arrays;

public class Vlad6 {
    public static void main(String[] args) {
        int[] test = new int[10];
        // int[] arr1 = { 2, 6, 8, 10, 22 }, arr2 = { 2, 3, 4, 19, 200 }, arr3 = new
        // int[arr1.length + arr2.length];
        // mergeArrays(arr1, arr1.length, arr2, arr2.length, arr3);
        // System.out.println(Arrays.toString(arr3));
        Carz mazda = new Carz(0, 'c', "test");
        System.out.println(mazda.getType());
        // Pizza pz = new Pizza(0, 0, 0, null);
    }

    public static void mergeArrays(int[] a, int len1, int[] b, int len2, int[] c) {
        if (len1 != 0 && len2 != 0) { // stop when one of arrays are empty
            if (a[len1 - 1] >= b[len2 - 1]) { // if number in a are bigger than b
                c[len1 + len2 - 1] = a[len1 - 1];
                mergeArrays(a, len1 - 1, b, len2, c); // run again with a-1
            } else { // if number in b are bigger than a
                c[len1 + len2 - 1] = b[len2 - 1];
                mergeArrays(a, len1, b, len2 - 1, c); // run again with b-1
            }
        }
        if (len1 == 0) // when a empty
            c[len2 - 1] = b[len2 - 1];
        if (len2 == 0) // when b empty
            c[len1 - 1] = a[len1 - 1];
        else
            ;
    }

    public static void callForRuler() {
        Scanner skaa = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int n = skaa.nextInt();
        printRuler(n, n);
    }

    public static void printRuler(int n, int level) {
        if (level == 0)
            return;
        printRuler(n, level - 1);
        System.out.print("-");
        for (int i = 0; i < level - 1; i++) {
            System.out.print("-");
        }
        System.out.println();
        printRuler(n, level - 1);
    }

    public static int[][] arrArr(int[] a) {
        int[][] newA = new int[a.length][];
        for (int i = 0; i < a.length; i++) {
            newA[i] = new int[a[i]];
            for (int j = 0; j < newA.length; j++)
                newA[i][j] = (int) (Math.random());
        }
        return newA;
    }

    /**
     * O(n)
     */
    public static void Vlad7() {
        String[] data = { "go64g1o", "m72om3o", "yoyo620" };
        String bestStudName = "";
        int bestStudScore = 1;
        for (int i = 0; i < data.length - 1; i++) {
            String studName = "";
            int studScore = 0;
            int mult = 100;
            for (int j = 0; j < data[i].length(); j++) {
                if (data[i].charAt(j) >= '0' && data[i].charAt(j) <= '9') {
                    studScore += (data[i].charAt(j) - '0') * mult;
                    mult /= 10;
                } else
                    studName += data[i].charAt(j);
            }
            if (studScore > bestStudScore) {
                bestStudScore = studScore;
                bestStudName = studName;
            }
        }
        System.out.println("The best student is: " + bestStudName + "\nAnd his score is: " + bestStudScore);
    }
}
