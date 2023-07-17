package CodeWars;

public class CountofPositive {
    public static int[] countPositivesSumNegatives(int[] input) {
        int[] nullarr = new int[0];
        if (input == null || input.length == 0)
            return nullarr;
        int[] arr = { 0, 0 };
        for (int i = 0; i <= input.length - 1; i++) {
            if (input[i] > 0)
                arr[0]++;
            else
                arr[1] += input[i];
        }
        return arr; // return an array with count of positives and sum of negatives
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15 };
        System.out.println(countPositivesSumNegatives(input)[0]);
        System.out.println(countPositivesSumNegatives(input)[1]);
    }
}
