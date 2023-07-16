import java.util.Scanner; // Import the Scanner class

public class Submission {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Initialize the Scanner
        int x1, y1, x2, y2, x3, y3, x4, y4;
        int p1, p2, p3, p4;
        System.out.print("Please enter the 1st number's X/Y: ");
        p1 = scan.nextInt();
        x1 = p1 / 10 % 10;
        y1 = p1 % 10;
        System.out.print("Please enter the 2nd number's X/Y: ");
        p2 = scan.nextInt();
        x2 = p2 / 10 % 10;
        y2 = p2 % 10;
        System.out.print("Please enter the 3rd number's X/Y: ");
        p3 = scan.nextInt();
        x3 = p3 / 10 % 10;
        y3 = p3 % 10;
        System.out.print("Please enter the 4th number's X/Y: ");
        p4 = scan.nextInt();
        x4 = p4 / 10 % 10;
        y4 = p4 % 10;
        if (x2 > x4 && y2 > y4)
            System.out.println("(" + x1 + "," + y1 + "),(" + x4 + "," + y4 + ")" + 1);
        else if (x2 > x4 && y2 < y4)
            System.out.println("(" + x1 + "," + y3 + "),(" + x2 + "," + y4 + ")" + 2);
        else if (y2 > y4 && x2 < x4)
            System.out.println("(" + x3 + "," + y1 + "),(" + x2 + "," + y4 + ")" + 3);
        else
            System.out.println("(" + x3 + "," + y3 + "),(" + x2 + "," + y2 + ")" + 4);
    }
}
