import java.util.Scanner; // Import the Scanner class
/*
 * This program determines the type of a triangle by the given 3 legs.
 * 
 * Author's name: Michael Verthin
 * Author's ID: 209506260
 */

public class Triangle2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Initialize the Scanner
        System.out.print("x = ");
        int x = scan.nextInt(); // Recieve the first leg
        System.out.print("y = ");
        int y = scan.nextInt(); // Receieve the second leg
        System.out.print("z = ");
        int z = scan.nextInt(); // Receieve the third leg
        System.out.print("The numbers: " + x + ", " + y + " and " + z + " "); // Initial output is the same
        if ((x + y) > z && (x + z) > y && (y + z) > x) { // Determine that the triangle is valid
            if (x == y && x == z && y == z) // Determine if equilateral
                System.out.println("represent an equilateral triangle");
            else if (x == y || x == z || y == z) // Determine if isosceles
                System.out.println("represent an isosceles triangle");
            else if ((x > y && x > z) && (y * y + z * z == x * x)) // Determine if right-angle option 1
                System.out.println("represent a right-angle triangle");
            else if ((y > x && y > z) && (x * x + z * z == y * y)) // Determine if right-angle option 2
                System.out.println("represent a right-angle triangle");
            else if ((z > x && z > y) && (x * x + y * y == z * z)) // Determine if right-angle option 3
                System.out.println("represent a right-angle triangle");
            else
                System.out.println("represent a common triangle"); // The triangle is non of the above, so it's Scalene
        } else
            System.out.println("cannot represent a triangle"); // Non valid output
    } // end of method main
} // end of class Triangle2
