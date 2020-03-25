import java.io.IOException;
import java.util.Scanner;

public class Replace_whitepaces_with_character {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the string : ");
        str=sc.nextLine();
        str=str.replaceAll(" ","|");  //here the character is considered is '|'
        System.out.println(str);
    }
}
