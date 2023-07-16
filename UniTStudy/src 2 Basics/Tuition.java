import java.util.Scanner;

public class Tuition {
    public static void main(String[] args) {
        final double SOLDIER = 0.9, FIGHTER = 0.5;
        final int INTENSE = 301, SUMMER = 286,
                BASE_NEW = 2079, BASE_OLD = 1539, SECURITY = 59;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter four numbers: ");
        int num1 = s.nextInt(); // ותק
        int num2 = s.nextInt(); // חייל
        int num3 = s.nextInt(); // מתכונת הנחיה
        int num4 = s.nextInt(); // קיץ
        int tuition;
        if (num1 == 1) // סטודנט חדש לפני 18 נז
            tuition = BASE_NEW;
        else // סטודנט ותיק אחרי 18 נז
            tuition = BASE_OLD;
        if (num2 == 1) // לוחם
            tuition *= FIGHTER;
        else if (num2 == 2) // חייל שאינו לוחם
            tuition *= SOLDIER;
        if (num3 == 2) // הנחיה מוגברת
            tuition += INTENSE;
        if (num4 == 2) // קיץ
            tuition += SUMMER;
        tuition += SECURITY; // אבטחה
        System.out.println("Tuition: " + tuition);
    }

}