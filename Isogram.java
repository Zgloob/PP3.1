public class Isogram {
    public static boolean isogram(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (i != s.lastIndexOf(s.charAt(i)))
                return false;
        }
        return true;

    }

    private static int lastIndexOf() {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isogram("blue water"));
        System.out.println(isogram("BLUE water"));
        System.out.println(isogram("red sun"));
    }
}
