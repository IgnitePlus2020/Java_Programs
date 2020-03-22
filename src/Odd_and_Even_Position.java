import java.io.IOException;
import java.util.Scanner;

public class Odd_and_Even_Position {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner((System.in));
        int n,i;
        System.out.println("Enter the limit : ");
        n=sc.nextInt();
        int[] a= new int[n];
        System.out.println("Enter the elements :");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The even  series is :");
        for(i=0;i<n;i+=2)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("The odd series is :");
        for(i=1;i<n;i+=2)
        {
            System.out.print(a[i]+" ");
        }
    }
}
