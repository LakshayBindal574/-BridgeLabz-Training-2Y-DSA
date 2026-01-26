import java.util.Scanner;

public class binearyMissing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        boolean[] seen = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] > 0 && a[i] <= n)
                seen[a[i]] = true;
        }

        int missing = 1;
        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                missing = i;
                break;
            }
        }

        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }

        int target = sc.nextInt();
        int left = 0, right = n - 1, index = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == target) {
                index = mid;
                break;
            }
            if (a[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        System.out.println(missing);
        System.out.println(index);
    }
}
