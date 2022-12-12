package first.java.misc;

public class Strings {
   /*   String is immutable.
        That is, its content cannot be modified once it is created.
        For example, the method toUpperCase() constructs and returns
        a new String instead of modifying the existing content.
    */


   /*   why immutable ???
        thread safe,
        caching(pooling),
        security(other code),
        easy reuse without replication, etc.
        can be used in hash DS , as they are immutable.
    */


   /*   Rule of Thumb : Strings are more efficient if they are not modified
        (because they are shared in the string common pool).
        However, if you have to modify the content of a string frequently
        (such as a status message),
        you should use the StringBuffer class (or the StringBuilder described below
        instead.
    */

   public static void main(String[] args) {
       String name = new String("kamal");
       System.out.println(name);
       /* reference to object "kamal" is lost because */
       /* new string is returned */
       name = name.toUpperCase();
       System.out.println(name);
    }
}
