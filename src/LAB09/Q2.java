package LAB09;

public class Q2 {
    public static void main(String[] args) {
        String s = "ABC";
        permuteString("", s);
    }

    public static void permuteString(String prefix, String remaining) {
        if (remaining.length() == 0) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < remaining.length(); i++) {
            String newPrefix = prefix + remaining.charAt(i);
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            permuteString(newPrefix, newRemaining);
        }
    }
}

