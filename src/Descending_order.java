import java.io.IOException;
import java.util.Scanner;

public class Descending_order {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int temp = 0, n, i, j;
        System.out.println("Enter the limit of the array :");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements :");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (i = n; i > 0; i--) {
            for (j = n- 1; j > 0; j--) {
                if (a[j] > a[j - 1]) {
                    temp = a[j];
                    a[j] = a[j -1];
                    a[j - 1] = temp;
                }
            }
        }
        System.out.println("The array after sorting ");
        for (i = 0; i < n; i++) {
            System.out.println(a[i] + " ");

        }
    }
}
