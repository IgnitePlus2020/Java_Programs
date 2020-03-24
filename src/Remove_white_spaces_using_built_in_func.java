import java.io.IOException;
import java.util.Scanner;

public class Remove_white_spaces_using_built_in_func {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the string : ");
        str=sc.nextLine();
        str=str.replaceAll("\\s+","");  //Any whitespace character = \\s
        System.out.println("The String removing spaces : "+str);
    }
}
