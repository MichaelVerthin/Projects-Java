import java.util.Scanner; // Import the Scanner class

public class Vlad2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = scan.nextInt();
        System.out.print("Please enter the amount: ");
        int a = scan.nextInt();
        int x = a;
        int tempTemp = num;
        int c = 0;
        while (tempTemp != 0) {
            tempTemp /= 10;
            c++;
        }
        if (c < x)
            num = 0;
        int newNum = 0;
        int temp;
        int mult = 1;
        while (num != 0) {
            if (c < x)
                x = c;
            a = x;
            temp = num % (int) Math.pow(10, a);
            newNum += ((temp % 10) * ((int) Math.pow(10, a - 1))) * mult;
            for (int i = 0; i < x - 1; i++) {
                if (num / 10 == 0) {
                    newNum += temp / 10;
                    break;
                } else {
                    newNum += ((temp / 10) % 10 * (int) Math.pow(10, a - 2)) * mult;
                    temp /= 10;
                    a -= 1;
                }
            }
            num /= (int) Math.pow(10, x);
            mult *= (int) Math.pow(10, x);
            c -= x;
        }
        if (newNum != 0)
            System.out.println(newNum);
    }

}
