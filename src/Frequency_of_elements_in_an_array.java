import java.io.IOException;
import java.util.Scanner;

public class Frequency_of_elements_in_an_array {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n, i, j;
        System.out.println("Enter the limit L");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] fr = new int[n];
        int visited = -1;

        for (i = 0; i < n; i++) {
            int count = 1;
            for (j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                    //To avoid counting same element again
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited)
                fr[i] = count;
        }

        //Displays the frequency of each element present in array
        System.out.println("---------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------");
        for (i = 0; i < n; i++) {
            if (fr[i] != visited)
                System.out.println("    " + a[i] + "    |    " + fr[i]);
        }
        System.out.println("---------------------");
    }
}