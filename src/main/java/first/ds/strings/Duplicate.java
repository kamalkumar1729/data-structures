package first.ds.strings;

public class Duplicate {
    public static void main(String[] args) {
        String str = "kamalkumar";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (str.indexOf(chars[i]) == i) {
                System.out.print(chars[i]);
            }
        }
    }
}