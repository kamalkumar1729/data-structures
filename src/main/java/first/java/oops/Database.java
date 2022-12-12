package first.java.oops;

import java.util.Arrays;
import java.util.List;

public abstract class Database {

    private static final Integer age = 23;

    private String name;

    public static void main(String[] args) {
        System.out.println("Main in Abstract class ");
    }

    public Database(String name) {
        System.out.println("Database constructor ");
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static {
        System.out.println("static block in Database");
    }

    private static List<String> getTables() {
        return  Arrays.asList("MASTER_DATA","SECTOR_DATA");
    }


    public String getDatabaseName() {
        return "MySQL";
    }

    public abstract int totalTables();
    public abstract int totalConnections();
    public String user() {
        return "admin";
    }
}