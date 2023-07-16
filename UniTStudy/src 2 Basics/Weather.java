import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        final int HOT = 30, COLD = 5;
        Scanner s = new Scanner(System.in);
        System.out.println("please enter 4 temperatures: ");
        int t1 = s.nextInt();
        int t2 = s.nextInt();
        int t3 = s.nextInt();
        int t4 = s.nextInt();

        int countCold = 0, countHot = 0;
        if (t1 >= HOT)
            countHot++;
        else if (t1 <= COLD)
            countCold++;
        if (t2 >= HOT)
            countHot++;
        else if (t2 <= COLD)
            countCold++;
        if (t3 >= HOT)
            countHot++;
        else if (t3 <= COLD)
            countCold++;
        if (t4 >= HOT)
            countHot++;
        else if (t4 <= COLD)
            countCold++;

        if (countHot == 1 || countHot == 2 || countCold == 1)
            System.out.println("Usual");
        else if ((countHot == 3 || countHot == 4) ||
                (countCold >= 2 && countCold <= 4))
            System.out.println("Extreme");
        else
            System.out.println("Other");
    }

}