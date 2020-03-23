import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Remove_duplicate_element {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n,i,j=0;
        System.out.println("Enter the limit :");
        n=sc.nextInt();
        int[] a = new int[n];
        int[] temp = new int[n];
        System.out.println("Enter the elements : ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        //sorting
        Arrays.sort(a);
        for(i=0;i<n-1;i++)
        {
            if(a[i]!=a[i+1]) {
                temp[j] = a[i];
                j++;
            }
        }
        temp[j]=a[n-1];
        System.out.println("The array after removing duplicate elements is :");
        for(i=0;i<n;i++)
        {
            System.out.print(temp[i]+" ");
        }
    }
}
