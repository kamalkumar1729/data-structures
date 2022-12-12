package first.java.misc;

public interface IDataAccess {
    default void printDataSource() {
        /* use default implementation else you can override it */
        System.out.println("Oracle");
    }


    /* to incrementally provide additional functionality to a given type,
      without breaking down the implementing classes*/
    default int getMaxNumberOfConn(String dataSource) {
        int maxConn = 10;
        switch (dataSource) {
            case "ORACLE":
                maxConn = 50;
                break;
            case "HBASE":
                maxConn = 20;
                break;
            case "MONGO":
                maxConn = 20;
                break;
        }
        return maxConn;
    }
}
