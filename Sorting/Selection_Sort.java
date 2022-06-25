
import java.util.Scanner;

public class Selection_Sort {

    static void sort(int a[], int n) {
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            int min = a[i];
            for (int j = i; j < n; j++) {
                if (a[j] <= min) {
                    temp = j;
                    min = a[j];
                }
            }
            a[temp] = a[i];
            a[i] = min;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the Element of Array :");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        sort(a, a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
