public class Vlad2_1 {
    public static void main(String[] args) {
        int streak = 0;
        int num = 10;
        int streakStr = 1;
        int temp = num;
        int newNum = 0;
        int endNum = num;
        while (streak < 3) {
            temp = num;
            while (endNum > 9) {
                newNum += (int) Math.pow((temp % 10), 2);
                temp /= 10;
                if (temp == 0) {
                    temp = newNum;
                    endNum = newNum;
                    newNum = 0;
                }
            }
            if (endNum == 1) {
                System.out.println(streakStr + ") " + num + " is a happy number :-)");
                streak++;
                streakStr++;
            } else
                streak = 0;
            endNum = num;
            num++;
        }
    }
}
