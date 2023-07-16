public class recUpString {
    public static void main(String[] args) {
        System.out.println("For call upString(\"bddfhijj\"), result is " + upString("bddfhijj"));
        System.out.println("For call upString(\"bddfhdjj\"), result is " + upString("bddfhdjj"));
        System.out.println("For call upString(\"dca\"), result is " + upString("dca"));
        System.out.println("For call upString(\"d\"), result is " + upString("d"));
        System.out.println("For call upString(\"\"), result is " + upString(""));
    }

    public static boolean upString(String s) {
        if (s.length() <= 1)
            return true;
        if (s.charAt(0) <= s.charAt(1))
            return upString(s.substring(1));
        return false;
    }
}
