
import java.util.*;

public class Insertion_Sort {

    static void sort(int a[], int n) {
        int j, i;
        for (i = 1; i < n; i++) {
            int q = a[i];
            for (j = i - 1; j >= 0; j--) {
                if (a[j] > q) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = q;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the Element of Array :");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sort(a, n);
        System.out.println("After the Sorting :");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
