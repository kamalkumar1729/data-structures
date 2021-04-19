package learnjava.java8;

import com.google.gson.Gson;
import learnjava.collection.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamAPI  {

    public static void main(String[] args) {
        List<Student> students = new ArrayList();

        List<List<Student>> listList = new ArrayList<>();

        students.add(new Student("kamal",101,31));
        students.add(new Student("kamal2",102,33));
        students.add(new Student("kamal3",103,32));
        students.add(new Student("kamal4",104,34));
        students.add(new Student("kamal5",104,31));
        students.add(new Student("kamal6",106,34));
        students.add(new Student("kamal7",107,32));
        students.add(new Student("kamal8",108,33));
        students.add(new Student("kamal9",103,34));
        students.add(new Student("kamal10",164,31));
        students.add(new Student("kamal11",194,32));
        students.add(new Student("kamal12",144,33));


        Map<String, List<Student>> map = new HashMap<>();
        map.put("praveen", students);


        listList.add(students);

        ArrayList<Integer> collect = listList
                .stream()
                .map(List::size)
                .collect(Collectors.toCollection(ArrayList::new));

        Set<String> stName = students
                .stream()
                .map(Student::getName)
                .collect(Collectors.toSet());

        // System.out.println(stName);


        /* curl :6002/jcp/CMCKPI/getKPIsByPolygonId?polygonId=2415102
        curl :6002/jcp/CMCKPI/getKPIsByPolygonId?polygonId=2090102
        */

        Gson gson = new Gson();
        System.out.println("**************");

        IntStream.range(1,10).forEach(x->System.out.print(x + " "));
        System.out.println();
        IntStream.rangeClosed(1,10).forEach(x->System.out.print(x + " "));

    }
}