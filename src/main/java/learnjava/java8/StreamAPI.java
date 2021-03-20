package learnjava.java8;

import learnjava.collection.Student;

import java.util.*;
import java.util.stream.Collectors;

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


        List<GridData> grids = new ArrayList<>();
        grids.add(new GridData(20.0,0.0,null,400L));
        grids.add(new GridData(-10.0,3.0,4.0,100L));
        grids.add(new GridData(-20.0,null,5.0,200L));
        grids.add(new GridData(null,3.0,0.0,300L));
        grids.add(new GridData(-10.0,-3.0,5.6,null));


        List<GridData> gridData = new ArrayList<>();
        gridData.add(new GridData(-88.0,-3.0,10.0,400L));
        gridData.add(new GridData(-75.0,-5.0,23.0,40L));
        gridData.add(new GridData(-20.0,3.0,34.0,4000L));
        gridData.add(new GridData(null,4.0,null,40000L));
        gridData.add(new GridData(-105.0,11.0,123.0,40L));
        gridData.add(new GridData(-75.0,15.0,900.0,400L));
        gridData.add(new GridData(-107.0,24.0,2342.0,null));
        gridData.add(new GridData(-112.0,24.0,null,40000L));
        gridData.add(new GridData(null,27.0,23.0,40L));
        gridData.add(new GridData(-107.0,66.0,800.0,400L));
        gridData.add(new GridData(-40.0,26.0,55.0,null));
        gridData.add(new GridData(-7.0,31.0,77.0,4000L));
        gridData.add(new GridData(null,32.0,567.0,400L));
        gridData.add(new GridData(-80.0,33.0,700.0,4000L));
        gridData.add(new GridData(-99.0,null,56789.0,null));
        gridData.add(new GridData(-100.0,34.0,2032.0,4000L));
        gridData.add(new GridData(-47.0,22.0,567.0,4L));
        gridData.add(new GridData(-60.0,23.0,null,40L));
        gridData.add(new GridData(-70.0,21.0,2342.0,4L));


        double sumUsers = (double) gridData
                .stream()
                .map(GridData::getUsers)
                .filter(Objects::nonNull)
                .mapToLong(Long::longValue)
                .sum();


        double avgRSRP = gridData
                .stream()
                .map(GridData::getRsrp)
                .filter(Objects::nonNull)
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.00);


        double avgSINR = gridData
                .stream()
                .map(GridData::getSinr)
                .filter(Objects::nonNull)
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.00);



        double avgTraffic = gridData
                .stream()
                .map(GridData::getTraffic)
                .filter(Objects::nonNull)
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.00);



        System.out.println("RSRP : " + avgRSRP);
        System.out.println("SINR : "+ avgSINR);
        System.out.println("USRS : "+ sumUsers);
        System.out.println("TRFC : "+ avgTraffic);



       /* Map<String, List<GridData>> usersGrouping = gridData
                .stream()
                .collect(Collectors.groupingBy(GridData::trafficGroups)), Collectors.counting())
*/



        // System.out.println("Sum of all all data : "+ reduce);

        // System.out.println(usersGrouping);

       // System.out.println(GridData.trafficGroups(new GridData(-7.0,1000.0,234.23,null)));


        // String ss = "Kamalageis"+23;
        //System.out.println(ss.length());

    }
}