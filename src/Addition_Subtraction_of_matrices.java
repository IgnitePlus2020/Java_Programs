import java.io.IOException;
import java.util.Scanner;

public class Addition_Subtraction_of_matrices {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int i, j, r,c;
        System.out.println("Enter the no. of rows :");
        r = sc.nextInt();
        System.out.println("Enter the no. of columns  :");
        c = sc.nextInt();
        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        int[][] sum = new int[r][c];
        int[][] sub=new int[r][c];
        System.out.println("Enter the elements of matrix 1:");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix 2:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("The matrix after addition :");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(" "+sum[i][j]);
            }
            System.out.println();
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                sub[i][j]=a[i][j]-b[i][j];
            }
        }
        System.out.println("The matrix after subtraction");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(" "+sub[i][j]);
            }
            System.out.println();
        }

    }
}
