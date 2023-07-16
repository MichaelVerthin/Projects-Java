public class recStringOk {
    public static void main(String[] args) {
        System.out.println("For call isStringOk(\"abcAbc\"), result is " + isStringOk("abcAbc"));
        System.out.println("For call isStringOk(\"785\"), result is " + isStringOk("785"));
        System.out.println("For call isStringOk(\"ab78\"), result is " + isStringOk("ab78"));
    }

    public static boolean isStringOk(String s) {
        return isLetters(s) || isNumbers(s);
    }

    public static boolean isLetters(String s) {
        if (s.length() <= 0)
            return true;
        if ((s.charAt(0) >= 'a' && s.charAt(0) <= 'z') || (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z'))
            return isLetters(s.substring(1));
        return false;
    }

    public static boolean isNumbers(String s) {
        if (s.length() <= 0)
            return true;
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9'))
            return isNumbers(s.substring(1));
        return false;
    }
}
