import java.io.IOException;
import java.util.Scanner;

public class Reverse_an_array {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("Enter the limit :");
        n=sc.nextInt();
        int[] a =new int[n];
        System.out.println("Enter the elements :");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The reverse array is :");
        for(i=n-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}
