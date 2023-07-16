
/*
 * App.java
 * This is the basic app that came with JAVA for VSCode
 */
import java.util.Scanner; // Import the Scanner class

public class App {

    public static void main(String[] args) {
        // String s = "123123123";
        // Prnt(s);
        // int[] arr1 = new int[5];
        // double[] arr = { 1.111, 100.52, 10.7, 13.9, 0.99, 0.42, 1.3 };
        // for (int i = 0; i < arr.length; i++) {
        // for (int z = i + 1; z < arr.length; z++) {
        // if (arr[i] + arr[z] == (int) (arr[i] + arr[z]))
        // System.out.println(true);
        // }
        // }
        // System.out.println((123456786 / 1000000) % 10);

        // int streak = 0;
        // int num = 10;
        // int streakStr = 1;
        // int temp = num;
        // int newNum = 0;
        // int endNum = num;
        // while (streak < 3) {
        // temp = num;
        // while (endNum > 9) {
        // newNum += (int) Math.pow((temp % 10), 2);
        // temp /= 10;
        // if (temp == 0) {
        // temp = newNum;
        // endNum = newNum;
        // newNum = 0;
        // }
        // }
        // if (endNum == 1) {
        // System.out.println(streakStr + ") " + num + " is a happy number :-)");
        // streak++;
        // streakStr++;
        // } else
        // streak = 0;
        // endNum = num;
        // num++;
        // }
        int[][] a = { { 1, 3, 1, 6 }, { 2, 8, 1, 2 }, { 6, 2, 7, 5 }, { 2, 4, 1, 3 } };
        System.out.println(howManyPaths(a));
        printDoubleArr(a);
    }

    public static int howManyPaths(int mat[][]) {
        return howManyPaths(mat, 0, 0);
    }

    private static int howManyPaths(int mat[][], int i, int j) {
        if (i == mat.length - 1 && j == mat[0].length - 1)
            return 1;
        if (i < 0 || j < 0 || i >= mat.length || j >= mat[0].length || mat[i][j] <= 0)
            return 0;
        int temp = mat[i][j];
        mat[i][j] = -1;
        int count = howManyPaths(mat, i + temp, j) + howManyPaths(mat, i, j + temp) +
                howManyPaths(mat, i - temp, j) + howManyPaths(mat, i, j - temp);
        mat[i][j] = temp;
        return count;
    }

    public static void Prnt(String s) {
        for (int i = 0; i < s.length(); i++)
            System.out.print(s.charAt(i));
    }

    public static void toStr(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length - 1; i++)
            System.out.print(a[i] + ",");
        System.out.println(a[a.length - 1] + "]");
    }

    public static void printDoubleArr(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i][0] < 0)
                System.out.print("[" + a[i][0]);
            else
                System.out.print("[ " + a[i][0]);
            for (int j = 1; j < a[i].length; j++) {
                if (a[i][j] < 0)
                    System.out.print(", " + a[i][j]);
                else
                    System.out.print(",  " + a[i][j]);
            }
            System.out.println("]");
        }
    }
    // public static void main(String[] args) {
    // System.out.println("Hello, World!\n");
    // int age;
    // double salary;
    // Scanner scan = new Scanner(System.in);
    // System.out.println("Please enter your age");
    // age = scan.nextInt();
    // System.out.println();
    // salary = scan.nextDouble();
    // if (age > 18 && age < 67)
    // salary = salary - 100;
    // System.out.println("Your salary is: " + salary);
    // }
    /*
     * Scanner scan = new Scanner(System.in); // Create a Scanner object
     * double height;
     * double width;
     * System.out.println(987.0 / 100);
     * System.out.
     * println("This program is calculating the parameter and the area of the given height and width"
     * );
     * System.out.print("Please enter the Rectangle height: ");
     * height = scan.nextDouble();
     * System.out.print("Please enter the Rectangle width: ");
     * width = scan.nextDouble();
     * System.out.println("The Parameter of the Rectangle is: " + (2 * height + 2 *
     * width));
     * System.out.println("The Area of the Rectable is: " + width * height);
     * System.out.println(num % 10); // אחדות
     * System.out.println(num / 10 % 10); // עשרות
     * System.out.println(num / 100); // מאות
     */

}