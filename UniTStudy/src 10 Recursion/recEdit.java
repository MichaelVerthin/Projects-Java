public class recEdit {
    public static void main(String[] args) {
        System.out.println("For call edit(str1 = \"geek\",str2 = \"gesek\"), result is " + edit("geek", "gesek"));
        System.out.println(
                "For call edit(str1 = \"sunday\",str2 = \"saturday\"), result is " + edit("sunday", "saturday"));
        System.out.println("For call edit(str1 = \"ello\",str2 = \"helo\"), result is " + edit("ello", "helo"));
    }

    public static int edit(String str1, String str2) {
        return edit(str1, str2, 0, 0, 0);
    }

    private static int edit(String str1, String str2, int i, int j, int count) {
        if (i == str1.length())
            return count + str2.length() - j;
        if (j == str2.length())
            return count + str1.length() - i;
        if (str1.charAt(i) == str2.charAt(j))
            return edit(str1, str2, i + 1, j + 1, count);
        else {
            int opt1 = edit(str1, str2, i, j + 1, count + 1);
            int opt2 = edit(str1, str2, i + 1, j, count + 1);
            return Math.min(opt1, opt2);
        }
    }
}
