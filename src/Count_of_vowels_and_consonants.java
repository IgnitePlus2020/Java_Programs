import java.io.IOException;
import java.util.Scanner;

public class Count_of_vowels_and_consonants {
    public static void main(String args[]) throws IOException{
        int Vcount=0,Ccount=0,i;
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        str=sc.nextLine();
       str= str.toLowerCase();
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'|| str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o'|| str.charAt(i)=='u')
                Vcount++;
            else if(str.charAt(i)>='a'&& str.charAt(i)<='z')
                Ccount++;
        }
        System.out.println("The Count of vowels is : "+Vcount+" and the Count of consanants is "+Ccount);
    }
}
