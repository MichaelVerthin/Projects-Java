import java.util.Scanner;

public class Worker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int DAYS = 20;
        char day;
        int w = 0, s = 0, v = 0;
        for (int k = 1; k <= DAYS; k++) {
            System.out.println("Press W for work, S for sick or V for vacation");
            day = scan.next().charAt(0);
            if (day == 'W')
                w++;
            else if (day == 'S')
                s++;
            else
                v++;
        }
        System.out.println("Work: " + w + ", Sick: " + s + ", Vacation: " + v);
    }
}