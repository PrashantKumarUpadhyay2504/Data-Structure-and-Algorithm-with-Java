
class Merge_Sort {

    static void merge(int a[], int l, int r, int m) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int arr1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = a[l + i];
        }
        int arr2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = a[m + i + 1];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                a[k] = arr1[i];
                i++;
            } else {
                a[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            a[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = arr2[j];
            j++;
            k++;
        }
    }

    static void sort(int a[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(a, l, m);
            sort(a, m + 1, r);
            merge(a, l, r, m);
        }
    }

    public static void main(String args[]) {
        int a[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Before : ");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
        sort(a, 0, 9);
        System.out.println();
        System.out.println("After : ");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
