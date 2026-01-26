import java.util.Scanner;

public class mergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] t = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int size = 1; size < n; size *= 2) {
            for (int left = 0; left < n - size; left += 2 * size) {
                int mid = left + size - 1;
                int right = Math.min(left + 2 * size - 1, n - 1);
                int i = left, j = mid + 1, k = left;

                while (i <= mid && j <= right)
                    t[k++] = a[i] <= a[j] ? a[i++] : a[j++];

                while (i <= mid)
                    t[k++] = a[i++];

                while (j <= right)
                    t[k++] = a[j++];

                for (i = left; i <= right; i++)
                    a[i] = t[i];
            }
        }

        for (int x : a)
            System.out.print(x + " ");
    }
}
