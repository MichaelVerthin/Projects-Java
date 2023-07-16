/**
 * Version: (2023a)
 * Author's name: Michael Verthin
 * Author's ID: 209506260
 */
public class Ex13 {
    public static void main(String[] args) {
        int[] a = { 1, 1, 1, 1, 1, 1, 1 };
        System.out.println(isWay(a));
    }

    /**
     * Question 1
     * ______________________
     * Time complex: O(n)
     * Mermory Complex: O(1)
     * 
     * @param s
     * @return
     */
    public static int alternating(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++)
            if (s.charAt(i) == s.charAt(i + 1))
                count++;
        count /= 2;
        return count;
    }

    /**
     * Question 2
     * ______________________
     * New Time complex: O(n)
     * New Mermory Complex: O(n)
     * ______________________
     * Old Time complex: O(n^2)
     * Old Mermory Complex: O(1)
     * 
     * @param a
     * @return the length of the largest subarray that has an even sum of its
     *         elements
     *         _____________________________________________________________________
     *         The previous version returned the length of the largest subarray that
     *         has an even sum of its elements, using another function f, to
     *         calculated sum of the elements within the subarray
     *         _____________________________________________________________________
     *         Why is is better?
     *         It creates another array "newArr" in the same size as the input array
     *         "a", where each element "newArr[i]" represents the length of the
     *         longest subarray that has an even sum
     *         _____________________________________________________________________
     *         The space complexity also increased to O(n) due to the creation of
     *         the newArr array, which is of the same size as the input array
     */
    public static int what(int[] a) {
        int[] newArr = new int[a.length];
        int maxLength = 0;
        for (int i = 0; i < a.length; i++) {
            newArr[i] = 1;
            if (a[i] % 2 == 0) {
                if (i > 0) {
                    newArr[i] = newArr[i - 1] + 1;
                }
                maxLength = Math.max(maxLength, newArr[i]);
            } else {
                if (i > 0) {
                    if (a[i - 1] % 2 == 0) {
                        newArr[i] = newArr[i - 1] + 1;
                    } else {
                        newArr[i] = 1;
                    }
                }
            }
        }
        return maxLength;
    }

    /**
     * Question 3
     * ______________________
     * Time complex: O(n^2)
     * Mermory Complex: O(n)
     * 
     * @param a
     * @return
     */
    public static boolean isWay(int[] a) {
        return isWay(a, 0, 0);
    }

    private static boolean isWay(int[] a, int i, int c) {
        if (i == a.length - 1)
            return true;
        if (i > a.length - 1 || i < 0 || c == a[i])
            return false;
        c = a[i];
        return isWay(a, i + a[i], a[i]) || isWay(a, i - a[i], a[i]);
    }

    /**
     * Question 4
     * 
     * @param drm
     * @param i
     * @param j
     * @return the minimum number of steps the Prince need to make before he get to
     *         the Super Mega Evil Bad Villain,
     *         If the Price can't find a way then he return -1
     */
    public static int prince(int[][] drm, int i, int j) {
        return princeMove(drm, i, j, 1);
    }

    /**
     * 
     * @param drm
     * @param i
     * @param j
     * @return false if the Prince is not near the -1 tile or true if he is near the
     *         tile (near the bad guy), so that he can save the princess!
     */
    private static boolean nearBadGuy(int[][] drm, int i, int j) {
        if ((i - 1 >= 0 && drm[i - 1][j] == -1) || (i + 1 <= drm.length - 1 && drm[i + 1][j] == -1)
                || (j - 1 >= 0 && drm[i][j - 1] == -1) || (j + 1 <= drm[i].length - 1 && drm[i][j + 1] == -1))
            return true;
        return false;
    }

    /**
     * This function is recurssive, it check beforehand if the Prince is able to
     * move to a certain tile before sending him to the next one, the movement
     * option he have are:
     * * 1. Move to a similer value tile (1->1)
     * * 2. Move to a higher value tile by 1 (2->3)
     * * 3. Move to a lower value tile by 2 (2->0)
     * _____________________________________________________________________
     * If the princee is out of ALL options and can't move any more anywhere then he
     * will give the princess up and return a -1 at the end
     * _____________________________________________________________________
     * Also this program is calling 'nearBadGuy' at every move, to verify if the
     * tile that the Prince is at is near the tile containning the -1 value (which
     * is only one)
     * 
     * @param drm
     * @param i
     * @param j
     * @param count
     * @return the minimum number of steps the Prince need to make before he get to
     *         the Super Mega Evil Bad Villain,
     *         If the Price can't find a way then he return -1
     */
    private static int princeMove(int[][] drm, int i, int j, int count) {
        if (nearBadGuy(drm, i, j))
            return count + 1;
        if (i - 1 >= 0
                && (drm[i - 1][j] == drm[i][j] || drm[i - 1][j] - drm[i][j] == 1 || drm[i][j] - drm[i - 1][j] == 2)) {
            drm[i][j] = -2;
            return princeMove(drm, i - 1, j, count + 1);
        }
        if (i + 1 <= drm.length - 1
                && (drm[i + 1][j] == drm[i][j] || drm[i + 1][j] - drm[i][j] == 1 || drm[i][j] - drm[i + 1][j] == 2)) {
            drm[i][j] = -2;
            return princeMove(drm, i + 1, j, count + 1);
        }
        if (j - 1 >= 0
                && (drm[i][j - 1] == drm[i][j] || drm[i][j - 1] - drm[i][j] == 1 || drm[i][j] - drm[i][j - 1] == 2)) {
            drm[i][j] = -2;
            return princeMove(drm, i, j - 1, count + 1);
        }
        if (j + 1 <= drm[i].length - 1
                && (drm[i][j + 1] == drm[i][j] || drm[i][j + 1] - drm[i][j] == 1 || drm[i][j] - drm[i][j + 1] == 2)) {
            drm[i][j] = -2;
            return princeMove(drm, i, j + 1, count + 1);
        }
        return -1;
    }
}
