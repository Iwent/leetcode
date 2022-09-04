import java.util.Arrays;

public class Anagram {


    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        char[] one = s.toCharArray();
        char[] second = t.toCharArray();

        Arrays.sort(one);
        Arrays.sort(second);

        return Arrays.equals(one, second);

    }

}
