
public class positive {

    public static void main(String[] args) {
        System.out.println("For call allPositive({4,3,4,5}), result is " + allPositive(new int[] { 4, 3, 4, 5 }));
        System.out.println("For call allPositive({23}), result is " + allPositive(new int[] { 23 }));
        System.out.println("For call allPositive({1,0}), result is " + allPositive(new int[] { 1, 0 }));
        System.out.println("For call allPositive({2,-1,3}), result is " + allPositive(new int[] { 2, -1, 3 }));
    }

    public static boolean allPositive(int[] a) {
        for (int i = 0; i < a.length; i++)
            if (a[i] <= 0)
                return false;
        return true;
    }
}
