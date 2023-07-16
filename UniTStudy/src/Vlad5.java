public class Vlad5 {
    public static void main(String[] args) {
        char[][] mat = {
                { 'a', 'a', 'a', 'a', 'a', '|' },
                { 'a', 'a', 'a', 'a', '|', '-' },
                { 'a', 'a', 'a', 'a', '|', 'a' },
                { 'a', 'a', 'a', 'a', '|', 'a' },
                { 'a', 'a', 'a', '|', '-', 'a' },
                { 'a', 'a', 'a', '|', 'a', 'a' }
        };
        System.out.println(upDownRouth(mat));
    }

    public static boolean upDownRouth(char[][] mat) {
        boolean isGood = true;
        int j = mat[0][mat[0].length - 1];
        int i = 0;
        if (mat[i][j] != '|')
            return false;
        while (isGood) {
            if (i > mat[mat[i].length - 1][j] || j > mat[i][mat[j].length - 1])
                return false;
            if (mat[i][j] == '|')
                i++;
            else if (mat[i][j] == '-')
                j--;
            else
                isGood = false;
        }
        return true;
    }
}
