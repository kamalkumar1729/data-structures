package first.java.collection;


import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Queues {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList();
        queue.add("Hello");
        queue.add("Cat");


        String name=null;

        if (name!=null && name.equals("kamal")) {
            System.out.println("Hello");
        } else {
            System.out.println("There");
        }


        System.out.println(seperateValuesByComma("kamal"));
        System.out.println(seperateValuesByComma("kamal,kumar,karnal"));


    }

    private static String seperateValuesByComma(String values) {
        String collect = Stream.of(values.split(",")).map(st -> "'" + st + "'").collect(Collectors.joining(", "));
        return collect;
    }
}
