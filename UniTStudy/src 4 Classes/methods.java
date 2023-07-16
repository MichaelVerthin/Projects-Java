import java.util.Scanner; // Import the Scanner class

public class methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Initialize the Scanner
        int num1, num2, num3;
        System.out.println("Please enter the first number: ");
        num1 = scan.nextInt();
        System.out.println("Please enter the second number: ");
        num2 = scan.nextInt();
        System.out.println("Please enter the third number: ");
        num3 = scan.nextInt();
        System.out.println("The maximum number is: " + return3Max(num1, num2, num3));
    }

    static int return3Max(int n1, int n2, int n3) {
        int max = 0;
        if (n1 > n2) {
            if (n1 > n3)
                max = n1;
        } else if (n2 > n3)
            max = n2;
        else if (n3 > n1) {
            if (n3 > n2)
                max = n3;
        }
        return (max);
    }
}
