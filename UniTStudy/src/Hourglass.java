
/**
 * Hourglass
 */
import java.util.Scanner;

public class Hourglass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int N = scan.nextInt();
        int x = N * 2 - 1;

        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < x; k++) {
                System.out.print("*");
            }
            x -= 2;
            System.out.println();
        }

        x = 1;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < x; k++) {
                System.out.print("*");
            }
            x += 2;
            System.out.println();
        }
    }
}