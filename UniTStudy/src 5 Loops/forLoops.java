import java.util.Scanner;

public class forLoops {
    public static boolean isPrimeNum(int num) {
        boolean isPrime = true;
        for (int i = 2; i <= num / 2 && isPrime == true; i++)
            if (num % i == 0)
                isPrime = false;
        return isPrime;
    }

    public static void main(String[] args) {
        final int N = 10;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter number");
        int first = s.nextInt(), second;
        boolean isUp = true;
        for (int i = 1; i <= N - 1 && isUp == true; i++) {
            second = first;
            System.out.println("Please enter number");
            first = s.nextInt();
            if (first <= second)
                isUp = false;
        }
    }
}
