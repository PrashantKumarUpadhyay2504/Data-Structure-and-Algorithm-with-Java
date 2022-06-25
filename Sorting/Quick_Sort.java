
import java.util.Scanner;

class Quick_Sort {

    static int partition(int a[], int low, int high) {
        int pivot = a[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                i++;
            }
        }
        a[high] = a[i];
        a[i] = pivot;
        return i;
    }

    static void quick(int a[], int l, int h) {
        if (l < h) {
            int p = partition(a, l, h);
            quick(a, l, p - 1);
            quick(a, p + 1, h);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the Element : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        quick(a, 0, n-1);
        System.out.println("After Sorting :  ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
