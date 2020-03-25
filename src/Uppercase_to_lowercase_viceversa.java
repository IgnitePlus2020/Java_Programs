import java.io.IOException;
import java.util.Scanner;

public class Uppercase_to_lowercase_viceversa {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str;
        int i;
        System.out.println("Enter the String :");
        str = sc.nextLine();
        StringBuffer str2 = new StringBuffer(str);
        for (i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                str2.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            } else if (Character.isUpperCase(str.charAt(i))) {
                str2.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
        }
        System.out.println("String after case conversion : " + str2);


    }
}
