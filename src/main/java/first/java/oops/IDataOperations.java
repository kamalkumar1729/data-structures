package first.java.oops;

public interface IDataOperations {
    static String name () {
        return "Hello from static method in interface";
    }
    String DB_NAME = "MyDatabase";
    void insertData();
    void updateData();
}