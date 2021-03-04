package learnjava.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // list.add("Lucas");
        // list.add("Andrew");
        // list.add("Charlie");

        list.add(null);
        list.add(null);

        System.out.println("list :- " + list);

        List<String> linked = new LinkedList<>();
        // linked.add("Lucas");
        // linked.add("Andrew");
        // linked.add("Charlie");
        linked.add(null);
        linked.add(null);

        System.out.println("linked list :- " + linked);

    }
}