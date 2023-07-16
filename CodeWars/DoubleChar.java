package CodeWars;

public class DoubleChar {
    public static String doubleChar(String s) {
        String Solution = "";
        for (int i = 0; i < s.length(); i++) {
            Solution += s.charAt(i);
            Solution += s.charAt(i);
        }
        return Solution;
    }

    public static void main(String[] args) {
        String str1 = "String";
        String str2 = "Hello World";
        String str3 = "1234!_ ";
        System.out.println(doubleChar(str1));
        System.out.println(doubleChar(str2));
        System.out.println(doubleChar(str3));
    }
}
