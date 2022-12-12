package first.java.oops;

public class Developer extends Employee {
    private String address;

    public Developer() {
        System.out.println("Developer is created");
    }

    public static String companyName(){
        //return Employee.companyName();
        return "Accenture";
    }

    public void myMotto() {
        System.out.println("To write good Code");
    }

    public Developer(String address) {
        this.address = address;
    }
}
