package LAB09;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(replace("flabbergasted", 0));
        System.out.println(replace("Astronaut", 0));
        System.out.println(replace2("Astronaut"));
    }
    public static String replace(String s, int idx){
        if (idx == s.length()) return s;
        if (s.charAt(idx) == 'a') {
            s = s.substring(0, idx) + 'i' + s.substring(idx + 1);
        }
        return replace(s, idx + 1);
    }
    public static String replace2(String s){
        if (s.length() == 0) return s;

        if (s.charAt(0) == 'a'){
            return 'i' + replace2(s.substring(1));
        }else{
            return s.charAt(0) + replace2(s.substring(1));
        }
    }
}
