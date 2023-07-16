public class recNoNum {
    public static void main(String[] args) {
        System.out.println("For call noNumbers(\"1ab34\"), result is " + noNumbers("1ab34"));
        System.out.println("For call noNumbers(\"abc\"), result is " + noNumbers("abc"));
        System.out.println("For call noNumbers(\"123\"), result is " + noNumbers("123"));
        System.out.println("For call noNumbers(\"74Ty2x\"), result is " + noNumbers("74Ty2x"));
    }

    public static String noNumbers(String s) {
        if (s.length() == 0)
            return "";
        if (s.charAt(0) >= '1' && s.charAt(0) <= '9')
            return noNumbers(s.substring(1));
        else
            return s.charAt(0) + noNumbers(s.substring(1));
    }
}
