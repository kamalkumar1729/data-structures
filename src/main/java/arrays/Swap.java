package arrays;

public class Swap {
    public static void main(String[] args) {
        /* swap two integers*/
        int var_one = 100;
        int var_two = 200;
        System.out.println("var_one => "+var_one + " var_two => "+var_two);

        /* swap a and b */
        /* take a temp variable first. */
        int temp_var = var_one;
        var_one = var_two;
        var_two = temp_var;
        System.out.println("var_one => "+var_one + " var_two => "+var_two);

        /* No extra variable. */
        int a = 10;
        int b = 20;
        System.out.println("a="+a+",b="+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a="+a+",b="+b);
    }
}
