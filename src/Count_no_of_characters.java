import java.io.IOException;
import java.util.Scanner;

//Count number of characters
//Eg: The sky is blue
public class Count_no_of_characters {
    public static void main(String args[]) throws IOException{
        Scanner sc =new Scanner(System.in);
        String str;
        int i,count=0;
        System.out.println("Enter the String ");
        str=sc.nextLine();
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)!= ' ')
                count++;
        }
        System.out.println("The total number of characters are "+count);
    }
}
