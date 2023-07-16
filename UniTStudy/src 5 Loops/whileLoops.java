public class whileLoops {
    public static int biggest(int num) {
        int big = -1;
        while (num > 0) {
            big = Math.max(big, num % 10);
            num = num / 10;
        }
        return big;
    }

    public static boolean up(int number) {
        int last = number % 10;
        number = number / 10;
        while (number > 0) {
            int temp = number % 10;
            if (temp <= last)
                return false;
            else {
                last = temp;
                number = number / 10;
            }
        }
        return true;
    }

    public static boolean isEqualsDistance(int num) {
        if (num < 10)
            return true;
        int last1 = num % 10;
        int last2 = num / 10 % 10;
        int dist = Math.abs(last1 - last2);
        num = num / 100;
        while (num > 0) {
            last1 = last2;
            last2 = num % 10;
            if (Math.abs(last1 - last2) != dist)
                return false;
            else
                num = num / 10;
        }
        return true;
    }
}
