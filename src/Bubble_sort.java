import java.io.IOException;
import java.util.Scanner;

    public class Bubble_sort {

        public static void main(String args[]) throws IOException {
            Scanner sc = new Scanner(System.in);
            int temp=0, n, i,j;
            System.out.println("Enter the limit of the array :");
            n = sc.nextInt();
            int[] a = new int[n];
            System.out.println("Enter the elements :");
            for (i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (i = 0; i < n; i++) {
                for (j = 0; j < n - i - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
            System.out.println("The array after sorting ");
            for (i = 0; i < n; i++)
            {
                System.out.println(a[i] + " ");

            }
        }
    }
