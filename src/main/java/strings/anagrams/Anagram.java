package strings.anagrams;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(areAnagrams3("kamal","kamla"));
    }

    private static boolean areAnagrams2(String a, String b) {
        /* sort and compare both strings*/
        char[] aa = a.toCharArray();
        Arrays.sort(aa);

        char[] bb = b.toCharArray();
        Arrays.sort(bb);

        return Arrays.equals(aa,bb);
        //return new String(aa).equals(new String(bb));
    }


    private static boolean areAnagrams3(String a, String b) {
        /* maintains a frequency of each letter in a word then
         * compare both hashMaps  */
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for (char c : a.toCharArray())
            map1.merge(c,1,(x,y)->x+y);

        for (char c : b.toCharArray())
            map2.merge(c,1,(x,y)->x+y);

        return map1.equals(map2);
    }


    // todo wrong method.
    //  will return true for (kamal != kamll)

    private static boolean areAnagrams(String str1, String str2) {
        if (str1.length() == str2.length()) {
            for (char c : str1.toCharArray()) {
                if (str2.indexOf(c) == -1)
                    return false;
            }
            for (char c : str2.toCharArray()) {
                if (str1.indexOf(c) == -1)
                    return false;
            }
            return true;
        }
        return false;
    }
}
