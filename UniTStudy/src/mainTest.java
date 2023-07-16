/**
 * Main class of the Java program.
 * 
 */
public class mainTest {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("For call isEqualsDistance(7975), result is " + isEqualsDistance(7975));
        System.out.println("For call isEqualsDistance(124), result is " + isEqualsDistance(124));
        System.out.println("For call isEqualsDistance(6), result is " + isEqualsDistance(6));
    }

    /**
     * 
     * @param num
     * @return
     */
    public static int biggest(int num) {
        int big = -1;
        while (num > 0) {
            big = Math.max(big, num % 10);
            num = num / 10;
        }
        return big;
    }

    /**
     * 
     * @param n
     */
    public static void fibonacci(int n) {
        int i = 0;
        int z = 1;
        System.out.print(z);
        while (i < n) {
            z += i;
            i += z - i;
            System.out.print(", " + z);
        }
    }

    public static boolean up(int n) {
        int b = n % 10; // take the right num
        while (n % 10 != 0) {
            n /= 10; // remove the right num
            if (b < n % 10)
                return false;
        }
        return true;
    }

    public static boolean isEqualsDistance(int n) {
        int diff = Math.max(n % 10, (n / 10) % 10) - Math.min(n % 10, (n / 10) % 10);
        while (n / 10 != 0) {
            int temp = n % 10;
            n /= 10;
            if (Math.max(n % 10, temp) - Math.min(n % 10, temp) != diff)
                return false;
        }
        return true;
    }
}
