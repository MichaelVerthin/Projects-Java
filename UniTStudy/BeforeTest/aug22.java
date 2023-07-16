public class aug22 {
    public static void main(String[] args) {
        // System.out.println(calc(3, 36, 4));
        // System.out.println(calc2(3, 36, 4));
        int[] a = { 3, 0, 0, 4, 7, 9, 0, 0, 0, 0, 11, 15, 0, 19, 20, 0, 0, 31, 40, 0 };
    }

    public static int calc(int num, int result, int maxOp) {
        return calc(num, result, maxOp, "", result);
    }

    public static int calc(int num, int result, int maxOp, String path, int curRes) {
        if (maxOp == 0 || result == num) {
            if (result == num)
                System.out.println(path + " = " + curRes);
            return result == num ? 1 : 0;
        }
        int res = 0;
        res += calc(num, result + num, maxOp - 1, path + " + " + num, curRes);
        res += calc(num, result - num, maxOp - 1, path + " - " + num, curRes);
        res += calc(num, result * num, maxOp - 1, path + " * " + num, curRes);
        if (num != 0 && result % num == 0)
            res += calc(num, result / num, maxOp - 1, path + " / " + num, curRes);
        return res;
    }

    public static int calc2(int num, int result, int maxOp) {
        if (maxOp == 0 || result == num)
            return result == num ? 1 : 0;
        int res = 0;
        res += calc2(num, result + num, maxOp - 1);
        res += calc2(num, result - num, maxOp - 1);
        res += calc2(num, result * num, maxOp - 1);
        if (num != 0 && result % num == 0)
            res += calc2(num, result / num, maxOp - 1);
        return res;
    }

    public static int kAlmostSearch(int[] a, int num) {
        int lo = 0;
        int hi = a.length - 1;
        int i = a.length / 2;
        while (lo < hi) {
            if (a[i] == num)
                return i;
            if (a[i] == 0) {// I've fallen on a stupid 0
                while (a[i] == 0)
                    i++;
                if (a[i] > num) {
                    i--;
                    while (a[i] == 0)
                        i--;
                } else if (a[i] < num) {
                    lo = i;
                    i += (hi - lo) / 2;
                }
            } else if (a[i] < num) {
                lo = i;
                i += i / 2;
            } else if (a[i] > num) {
                hi = i;
                i -= (hi - lo) / 2;
            }
        }
        return -1;
    }
}
