import java.io.IOException;
import java.util.Scanner;

public class Duplicate_characters {
    public static void main(String args[]) throws IOException {
        String str;
        int count;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        str = sc.nextLine();
        char[] string = str.toCharArray();
        int i, j;
        System.out.println("The Duplicate characters in the given string:");
        for (i = 0; i < string.length; i++) {
            count=1;
            for (j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ') {
                    count++;
                    string[j] = '0';
                }
            }
            if (count >1&& string[i] != '0')
                System.out.println(string[i]);
        }
    }
}