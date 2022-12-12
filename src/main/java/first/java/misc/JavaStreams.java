package first.java.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreams {
    public static void main(String[] args) {
        /* streams are functional view of data sources */
        /* views of collection , views of io channels*/
        // primitiveStream();
        objectStream();
    }

    private static void objectStream() {
        /* person list to stream */
        List<Person> personList = new ArrayList<>();
        Person person = new Person(27,"kamal","Ghansoli");
        personList.add(person);

        final Stream<Person> stream = personList.stream();
        stream.forEach(person1 -> System.out.println(person1.toString()));

        final Stream<Person> personStream = Stream.of(person);
        final Stream<Person> personStream2 = Stream.empty();
    }

    private static void primitiveStream() {
        /* creations method 1 ;; from collection */
        List<String> wordList = Arrays.asList("cat","tac","kamal","kalam","hejetro","jheerot");
        wordList.stream().forEach(System.out::println);

        /* creation method 2 ;; Stream.of */
        Stream<String> stringStream = Stream.of("kamal", "kumar");
        stringStream.forEach(System.out::println);
    }
}
