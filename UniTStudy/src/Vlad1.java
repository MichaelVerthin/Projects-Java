import java.util.Scanner; // Import the Scanner class

public class Vlad1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = scan.nextInt();
        int newNum = 0;
        int temp;
        int mult = 1;
        while (num != 0) {
            temp = num % 100;
            if (num / 10 == 0) {
                newNum += temp * mult;
                break;
            } else {
                temp = ((temp % 10 * 10) + (temp / 10 % 10)) * mult;
                newNum += temp;
                num /= 100;
            }
            mult *= 100;
        }
        System.out.println(newNum);
    }

}
