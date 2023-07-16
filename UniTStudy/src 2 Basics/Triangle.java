import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter x y for A, x y for B, x y for C: ");
        int xA = s.nextInt();
        int yA = s.nextInt();
        int xB = s.nextInt();
        int yB = s.nextInt();
        int xC = s.nextInt();
        int yC = s.nextInt();
        double lenAB = Math.sqrt(Math.pow(xA - xB, 2) +
                Math.pow(yA - yB, 2));
        double lenAC = Math.sqrt(Math.pow(xA - xC, 2) +
                Math.pow(yA - yC, 2));
        double lenBC = Math.sqrt(Math.pow(xB - xC, 2) +
                Math.pow(yB - yC, 2));
        if (lenAB == lenAC && lenAC == lenBC)
            System.out.println("Equilateral triangle");
        else if (lenAB == lenAC || lenAC == lenBC ||
                lenAB == lenBC)
            System.out.println("Isosceles triangle");
        else
            System.out.println("Triangle");
    }
}