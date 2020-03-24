import java.io.IOException;
import java.util.Scanner;

public class Divide_string_in_n_equal_parts {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        String str;
        int n,temp=0;
        System.out.println("Enter the string ");
        str=sc.nextLine();
        int len = str.length();
        System.out.println("Enter the no. of times you want to divide the string :");
        n=sc.nextInt();
        String[] str2= new String[n];
        int i,chars=(len/n);
        if(len%n!=0)
        {
            System.out.println("The string cannot be divided into n equal parts");
        }
        else {
            for (i = 0; i < str.length(); i = i + chars) {
                String part = str.substring(i, i + chars);
                str2[temp] = part;
                temp++;
            }
            System.out.println("The string after dividing into n Equal parts");
            for (i = 0; i <n; i++) {
                System.out.println(str2[i]);
            }
        }
    }
}
