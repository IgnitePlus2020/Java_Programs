import java.io.IOException;
import java.util.Scanner;

public class Shift_right {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter the limit :");
        n=sc.nextInt();
        int[] a= new int[n];
        System.out.println("Enter the elements :");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<1;i++)
        {
            int last = a[n-1];
            for(j=n-1;j>0;j--)
            {
                a[j]=a[j-1];
            }
            a[0]=last;
        }
        System.out.println("The array after right shift :  ");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
