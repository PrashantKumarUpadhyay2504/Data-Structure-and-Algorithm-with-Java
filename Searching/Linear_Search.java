
import java.util.*;

public class Linear_Search {

    static boolean search(int a[], int n) {
        for (int i = 0; i < 5; i++) {
            if (a[i] == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        boolean re = search(a, n);
        if (re == true) {
            System.out.println("No. Found....");
        } else {
            System.out.println("Not Found....");
        }

    }

}
