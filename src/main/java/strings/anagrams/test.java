package strings.anagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class test {
    public static void main(String[] args) {
        final HashMap<Integer, List<String>> map = new HashMap<>();
        List<String> ll = new ArrayList<>();
        ll.add("kamal");
        map.put(1,ll);

        final List<String> list = map.get(1);
        list.add("kumar");

        System.out.println(map.get(1));
    }
}
