public class recSumSnake {
    public static int maxSumSnake(int[][] m) {
        return maxSumSnake(m, 0, 0);
    }

    private static int maxSumSnake(int[][] m, int i, int j) {
        final int BEEN_HERE = -10;
        if (i == m.length - 1 && j == m[0].length - 1)
            return m[i][j];
        // avoid repeat a cell
        int temp = m[i][j];
        m[i][j] = BEEN_HERE;
        // recurtion for all neighbors
        int up = -1, down = -1, left = -1, right = -1;
        if (i - 1 >= 0 && Math.abs(temp - m[i - 1][j]) <= 1)
            up = maxSumSnake(m, i - 1, j);
        if (i + 1 < m.length && Math.abs(temp - m[i + 1][j]) <= 1)
            down = maxSumSnake(m, i + 1, j);
        if (j - 1 >= 0 && Math.abs(temp - m[i][j - 1]) <= 1)
            left = maxSumSnake(m, i, j - 1);
        if (j + 1 < m[0].length && Math.abs(temp - m[i][j + 1]) <= 1)
            right = maxSumSnake(m, i, j + 1);
        m[i][j] = temp;
        // couldn't find a path
        if (up == -1 && down == -1 && left == -1 && right == -1)
            return -1;
        // return the max path
        int max = Math.max(Math.max(up, down), Math.max(left, right));
        return max + m[i][j];
    }
}
