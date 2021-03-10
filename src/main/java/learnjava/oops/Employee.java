package learnjava.oops;

public class Employee {

    protected int height;
    private int salary;
    private String name;
    private int age;
    private int joiningYear;

    public Employee() {
        super();
        System.out.println("Employee is created");
    }

    public Employee(String name, int age, int joiningYear) {
        this.name = name;
        this.age = age;
        this.joiningYear = joiningYear;
    }


    public static String companyName() {
        return "RJIL";
    }

    public void myMotto() {
        System.out.println("To perform with my best abilities");
    }


    public int getSalary() {
        return salary;
    }

    protected void setSalary(int salary) {
        this.salary = salary;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJoiningYear(int joiningYear) {
        this.joiningYear = joiningYear;
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", joiningYear=" + joiningYear +
                '}';
    }
}
