public class recPolindrome {
    public static void main(String[] args) {
        System.out.println("For call isPalindrome(s = \"helleh\"), result is " + isPalindrome("helleh"));
        System.out.println("For call isPalindrome(s = \"heleh\"), result is " + isPalindrome("heleh"));
        System.out.println("For call isPalindrome(s = \"helaeh\"), result is " + isPalindrome("helaeh"));
        System.out.println("For call isPalindrome(s = \"abc\"), result is " + isPalindrome("abc"));
    }

    public static boolean isPalindrome(String s) {
        if (s.length() <= s.length() % 2)
            return true;
        if (s.charAt(0) == s.charAt(s.length() - 1))
            return isPalindrome(s.substring(1, s.length() - 1));
        return false;
    }

    public static boolean isPalindromeRes(String s) {
        if (s.length() == 1 || s.length() == 0)
            return true;
        return (s.charAt(0) == s.charAt(s.length() - 1)) &&
                isPalindrome(s.substring(1, s.length() - 1));
    }

    public static boolean isPalindrome(int[] a) {
        return isPalindrome(a, 0, a.length - 1);
    }

    private static boolean isPalindrome(int[] a, int start, int end) {
        if (start >= end)
            return true;
        if (a[start] != a[end])
            return false;
        return isPalindrome(a, start + 1, end + 1);
    }

    private static boolean isPalindrome(int[] a, int k) {
        if (k >= a.length / 2)
            return true;
        if (a[k] == a[a.length - k - 1])
            return isPalindrome(a, k + 1);
        return false;
    }
}
