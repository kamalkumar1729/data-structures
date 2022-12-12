package first.java.collection;

public class HashCodes {
    public static void main(String[] args) {

        Student a = new Student("A",101,11);
        Student b = new Student("B",102,12);
        Student c = new Student("C",103,13);
        Student d = new Student("D",104,14);


        // different references
        System.out.println(a==b); //false

        b=a;

        // same references
        System.out.println(a==b); //true


        System.out.println(a.equals(b));



        // System.out.println(c.equals(b));

        String var1 = new String("kamal");
        String  var2 = new String("kamal");
       // System.out.println(var1 == var2);


        String var3 = "kamal";
        String var4 = "kamal";

       // System.out.println(var3==var4);


       String intern_var1= var1.intern();

       // System.out.println(var3 == intern_var1);








    }
}
