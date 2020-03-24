import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        String str1,str2;
        System.out.println("Enter the String 1 :");
        str1=sc.nextLine();
        System.out.println("Enter the String 2 :");
        str2=sc.nextLine();
        if(str1.length()!=str2.length())
            System.out.println("The strings are not anagram");
        else {
            char[] string1=str1.toCharArray();
            char[] string2=str2.toCharArray();

            Arrays.sort(string1);
            Arrays.sort(string2);
            if(Arrays.equals(string1,string2) ==true) {
                System.out.println("Both strings are anagram");
            }
            else {
                System.out.println("Both strings are not anagram");
            }
        }
    }
}
