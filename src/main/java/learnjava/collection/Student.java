package learnjava.collection;

import java.util.Objects;

public class Student {

    private String name;
    private Integer rollNo;
    private Integer age;

    public Student(String name, Integer rollNo, Integer age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return " Student {" +
                "  name = '" + name + '\'' +
                ", rollNo = " + rollNo +
                ", age = " + age +
                '}' ;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name) &&
                rollNo.equals(student.rollNo) &&
                age.equals(student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo, age);
    }
}