package LAB09;

public class Q2 {
    public static void main(String[] args) {
        String s = "AABC";
        int[] count = new int[26];
        for(Character ch : s.toCharArray()){
            count[ch - 'A']++;
        }
        // Count the number of unique characters
        int unique = 0;
        for(int c : count){
            if (c > 0) unique++;
        }
        // Build the str array
        char str[] = new char[unique];
        int j = 0; // for iterating the str array
        for(int i=0; i<count.length; i++){
            if (count[i] > 0){
                str[j++] = (char)(i + 'A');
            }
        }
        char[] result = new char[s.length()];
        getPermutation(str, count, result, 0);
    }
    public static void getPermutation(char[] str, int[] count, char[] result, int level){
        if (level == result.length){
            printArray(result);
        }
        for(int i=0; i<str.length; i++){
            if (count[i] == 0) continue;
            result[level] = str[i];
            count[i]--;
            getPermutation(str, count, result, level + 1);
            count[i]++;
        }
    }
    public static void printArray(char[] array){
        for(Character ch : array) System.out.print(ch);
        System.out.println();
    }

    public static void permuteString(String startingString, String endingString){
        if (endingString.length() <= 1) {
            System.out.println(startingString + endingString);
            return;
        }
        for(int i=0; i<endingString.length(); i++){
            String temp = endingString.substring(0, i) + endingString.substring(i+1);
            permuteString(startingString + endingString.charAt(i), temp);
        }
    }
    /*
    public static void permute(String s, int index){
        if (index == s.length()){
            System.out.println(s);
            return;
        }
        for(int i=index; i<s.length(); i++){
            s = swap(s, i, index);
            permute(s, index + 1);
            s = swap(s, i, index);
        }
    }
    public static String swap(String s, int i, int j){
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(i, s.charAt(j));
        sb.setCharAt(j, s.charAt(i));
        return sb.toString();
    }
    */

}
