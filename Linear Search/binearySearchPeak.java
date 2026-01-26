import java.util.Scanner;
public class binearySearchPeak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if ((mid == 0 || a[mid] > a[mid - 1]) && (mid == n - 1 || a[mid] > a[mid + 1])) {
                System.out.println(a[mid]);
                break;
            }

            if (mid > 0 && a[mid] < a[mid - 1])
                right = mid - 1;
            else
                left = mid + 1;
        }
    }
}
