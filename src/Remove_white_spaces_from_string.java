//without using built in function

import java.io.IOException;
import java.util.Scanner;

public class Remove_white_spaces_from_string {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        String str;
        int i,j=0;
        System.out.println("Enter the string :");
        str=sc.nextLine();
        char[] string=str.toCharArray();
        char[] str2= new char[str.length()];
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
                continue;
            str2[j]=str.charAt(i);
            j++;

        }
        for(i=0;i<str2.length;i++)
        {
            System.out.print(str2[i]);
        }

    }
}
