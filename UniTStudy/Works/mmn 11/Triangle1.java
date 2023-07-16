import java.util.Scanner; // Import the Scanner class
/*
 * This program calculates the area and the perimeter of a given triangle.
 * 
 * Author's name: Michael Verthin
 * Author's ID: 209506260
 */

public class Triangle1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Initialize the Scanner
        System.out.println("This program calculates the area "
                + "and the perimeter of a given triangle. ");
        System.out.println("Please enter the three lengths"
                + " of the triangle's sides");
        int a = scan.nextInt(); // Recieve the first leg
        int b = scan.nextInt(); // Recieve the second leg
        int c = scan.nextInt(); // Recieve the third leg
        System.out.println("The lengths of the triangle sides are: " + a + ", " + b + ", " + c + ".");
        int s, par;
        double area;
        par = a + b + c;
        System.out.println("The perimeter of the triangle is: " + (int) par); // output the paramiter of the legs
        s = (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The Area of the Triangle is: " + area); // output the area using Heron's formula
    } // end of method main
} // end of class Triangle1