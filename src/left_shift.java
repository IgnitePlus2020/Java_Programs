import java.io.IOException;
import java.util.Scanner;

public class left_shift {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter the limit : ");
        n=sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the element :");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<1;i++) //left shift takes place once as i<1
        {
            int first = a[0];
            for(j=0;j<n-1;j++)
            {
                a[j]=a[j+1];
            }
            a[j]=first;
        }
        System.out.println("The elements after left shifting :");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
