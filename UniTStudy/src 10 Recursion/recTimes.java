public class recTimes {
    public static void main(String[] args) {
        System.out.println("For call times(s = \"hello\",ch = \'e\'), result is " + times("hello", 'e'));
        System.out.println("For call times(s = \"hello\",ch = \'l\'), result is " + times("hello", 'l'));
        System.out.println("For call times(s = \"hello\",ch = \'f\'), result is " + times("hello", 'f'));
    }

    public static int times(String s, char ch) {
        if (s.length() == 0)
            return 0;
        else if (s.charAt(0) == ch)
            return 1 + times(s.substring(1), ch);
        else
            return 0 + times(s.substring(1), ch);
    }

}
