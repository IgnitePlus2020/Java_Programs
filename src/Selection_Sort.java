import java.io.IOException;
import java.util.Scanner;

public class Selection_Sort {
    public static void main(String args[]) throws IOException{
        int min,i,n,j,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of the array :");
        n=sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements : ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            min=a[i];
            int index =i;
            for(j=i;j<n;j++) {
                if (a[j] < min) {
                    min = a[j];
                    index = j;
                }
            }
                if(min<a[i]){
                    temp=a[i];
                    a[i]=a[index];
                    a[index]=temp;
                }
            }
        System.out.println("After swapping :");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
