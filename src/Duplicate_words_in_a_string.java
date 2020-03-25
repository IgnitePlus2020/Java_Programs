import java.io.IOException;
import java.util.Scanner;

public class Duplicate_words_in_a_string {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str;
        int count, i, j;
        System.out.println("Enter the string :");
        str = sc.nextLine();
        str=str.toLowerCase();
        String[] words = str.split(" ");
        System.out.println("The duplicate words are :");
        for (i = 0; i < words.length; i++) {
            count = 1;
            for (j = i + 1; j < words.length; j++) {
                if ((words[i].equals(words[j]))) {
                    count++;
                    words[j] = "0";
                }
            }
            if (count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }
    }
}
