package DSA;

public class isUnique {
    public static void main(String[] args) {
        String s = "abca";
        System.out.println(isUnique(s));
    }
    public static boolean isUnique(String s) {
        int n = s.length();
        boolean[] freq = new boolean[256];
        for (int i = 0; i < n; i++) {
            if (freq[s.charAt(i)]) return false;
            freq[s.charAt(i)] = true;
        }
        return true;
    }
}
