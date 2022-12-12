package first.java.collection;

public class HelloEnums {

    enum Day { sun, mon, tue, wed, thr, fri, sat };

    public static void main(String[] args) {
        System.out.println();
        Day dd = Day.fri;

        switch (dd) {
            case tue:
            case thr:
            case fri:
            case mon:
            case sat:
            case sun:
            case wed:
        }
    }
}
