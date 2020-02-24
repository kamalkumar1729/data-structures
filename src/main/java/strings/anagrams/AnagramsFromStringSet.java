package strings.anagrams;

import java.util.*;

public class AnagramsFromStringSet {
    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("cat","tac","kamal","kalam","hejetro","jheerot");
        List<String> wordList2 = Arrays.asList("cat","tac");
        wordList = findAllAnagrams(wordList);
        System.out.println(wordList);
    }

    private static List<String> findAllAnagrams(List<String> words) {
        Map<String,List<String>> map = new HashMap<>();
        for (String word : words) {
            char[] wordChars = word.toCharArray();
            Arrays.sort(wordChars);
            String hash = new String(wordChars);
            List<String> anagrams = map.get(hash);

          /*  if (anagrams != null) {
                anagrams.add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(hash,list);
            }*/

            List<String> list = new ArrayList<>();
            list.add(word);
            map.merge(hash,list,(ol,nl)->{ol.addAll(nl);return ol;});

        }

        final List<String> anagrams = new ArrayList<>();
        map.values().forEach((list) -> {
            if (list.size()>1)
                anagrams.addAll(list);
        });

        return anagrams;
    }
}
