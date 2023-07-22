package CodeWars;

public class SmallestInteger {
    public static int findSmallestInt(int[] args) {
        int small = args[0];
        for (int i = 0; i < args.length; i++) {
            if (args[i] < small)
                small = args[i];
        }
        return small;
    }

    public static void main(String[] args) {
        int[] a = { 78, 56, 232, 12, 11, 43 };
        System.out.println(findSmallestInt(a));
    }
}
