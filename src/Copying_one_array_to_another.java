import java.io.IOException;
import java.util.Scanner;

public class Copying_one_array_to_another {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("Enter the limit of the array :");
        n=sc.nextInt();
        int[] a1=new int[n];
        int[] a2= new int[n];
        System.out.println("Enter the elements of array one :");
        for(i=0;i<n;i++)
        {
            a1[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            a2[i]=a1[i];
        }
        System.out.println("The Copied array :");
        for(i=0;i<n;i++)
        {
            System.out.print(a2[i]+" ");
        }
    }
}
