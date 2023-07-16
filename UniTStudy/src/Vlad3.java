public class Vlad3 {
    public static final int MSZ = 15;

    public static void main(String[] args) {
        char[][] z = new char[MSZ][MSZ];
        fillMatrix5(z);
        printMatrix(z);
    }

    public static void fillMatrix(char[][] m) {
        int i, j;

        for (i = 0; i < m.length; i++)
            for (j = 0; j < m[i].length; j++)
                m[i][j] = '*';

        m[m.length / 2][m.length / 2] = 'O';
    }

    public static void fillMatrix1(char[][] m) {
        int i, j;

        for (i = 0; i < m.length; i++)
            for (j = 0; j < m[i].length; j++) {
                if (i < m.length / 2)
                    m[i][j] = '*';
                else if (i > m.length / 2)
                    m[i][j] = 'O';
                else
                    m[i][j] = ' ';
            }

    }

    public static void fillMatrix2(char[][] m) {
        int i, j;

        for (i = 0; i < m.length; i++)
            for (j = 0; j < m[i].length; j++) {
                if (j < m.length / 2)
                    m[i][j] = '*';
                else if (j > m.length / 2)
                    m[i][j] = 'O';
                else
                    m[i][j] = ' ';
            }

    }

    // main diagonal
    public static void fillMatrix3(char[][] m) {
        int i, j;

        for (i = 0; i < m.length; i++)
            for (j = 0; j < m[i].length; j++) {
                if (i < j)
                    m[i][j] = '*';
                else if (i > j)
                    m[i][j] = 'O';
                else
                    m[i][j] = ' ';
            }

    }

    // secondary diagonal
    public static void fillMatrix4(char[][] m) {
        int i, j;
        // only *
        for (i = 0; i < m.length - 1; i++)
            for (j = 0; j < m[i].length - i - 1; j++)
                m[i][j] = '*';
        // only 'O'
        for (i = 1; i < m.length; i++)
            for (j = m.length - 1; j >= m[i].length - i; j--)
                m[i][j] = 'O';
        // only SPACE
        for (i = 0; i < m.length; i++)
            m[i][m.length - 1 - i] = ' ';
    }

    // frame of STARS
    public static void fillMatrix5(char[][] m) {
        int i, j;
        // only 'O'
        for (i = 1; i < m.length - 1; i++)
            for (j = 1; j < m[i].length - 1; j++)
                m[i][j] = 'O';
        // now the frame of STARS
        for (i = 0; i < m.length; i++) {
            m[0][i] = '*'; // first line
            m[m.length - 1][i] = '*'; // last line
            m[i][0] = '*'; // first column
            m[i][m.length - 1] = '*'; // last column
        }
    }

    public static void printMatrix(char[][] m) {
        int i, j;

        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++)
                System.out.printf("%c ", m[i][j]); // System.out.print(""+m[i][j]);
            System.out.println();
        }
    }
}
