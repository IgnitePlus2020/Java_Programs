import java.io.IOException;
import java.util.Scanner;

public class Insertion_sort {
    public static void main(String args[]) throws IOException{
        int n,temp=0,i,j;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the limit of the array :");
        n=sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements :");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=1;i<n;i++)
        {
            int key=a[i];
            j=i-1;
            while(j>=0 &&key<=a[j])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                j--;
            }
        }
        System.out.println("The array after sorting :");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
