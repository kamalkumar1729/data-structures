package learnjava.collection;

import java.util.*;

public class Sets {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        hashSet.add("KAMAL");
        hashSet.add("KUMAR");
        hashSet.add("KAMAL");
       // System.out.println(hashSet);



        Set<String> linkedSet = new LinkedHashSet<>();

        linkedSet.add("Hello");
        linkedSet.add("Hello_2");
        linkedSet.add("Hello_3");
        linkedSet.add("Hello_4");
        linkedSet.add("Hello_5");


        // System.out.println(linkedSet);



        Set<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

        /** Can't add null to TreeSet as it uses comparator */
       // treeSet.add(null);

        treeSet.add("AA");
        treeSet.add("XX");
        treeSet.add("Xasfa");
        treeSet.add("Xasdfadf");
        treeSet.add("XXadfadfadf");
        treeSet.add("X12334");

       //  System.out.println(treeSet);





        /** USING COMPARABLE */

        TreeSet<Student> ts = new TreeSet<>();
        // ts.add(new Student("AA",100,10));
        // ts.add(new Student("BB",101,11));
        // ts.add(new Student("CC",102,12));
        // ts.add(new Student("DD",102,13));

        ts.add(null);
        /* DD will not be added; as TreeSet thinks it already there in set.
        *  DD compares same with CC as per Comparable / Comparator*/

        System.out.println(ts);

        String name = "KAMAL";

    }
}
