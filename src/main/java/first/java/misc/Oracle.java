package first.java.misc;

import java.util.ArrayList;
import java.util.List;

public class Oracle implements IDataAccess {
    public static void main(String[] args) {
       // System.out.println(new Oracle().getMaxNumberOfConn("ORACLE"));

        List<ITest> list = new ArrayList<>();
        list.add(new TestA());
        list.add(new TestB());

        for (ITest test : list) {
            test.X();
        }
    }
}
