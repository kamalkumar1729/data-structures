package first.ds.strings.anagrams;

import java.util.*;

public class AllAnagramsOfString {

    public static void main(String[] args) {
        System.out.println(allAnagrams("kamalkumar"));
    }

    // fixme: This is wrong ; Correct it 1 year later; Maybe not. :)
    private static Set<String> allAnagrams(String str) {
        final char[] charArray = str.toCharArray();
        final Set<String> set = new HashSet<>();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j <= i; j++) {
                set.add(new String(Arrays.copyOfRange(charArray,j,i)));
            }
        }
        return set;
    }
}
