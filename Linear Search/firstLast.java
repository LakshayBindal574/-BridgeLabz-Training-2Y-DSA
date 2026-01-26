import java.util.Scanner;

public class firstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int target = sc.nextInt();
        int first = -1, last = -1;

        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (a[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        left = 0;
        right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == target) {
                last = mid;
                left = mid + 1;
            } else if (a[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        System.out.println(first + " " + last);
    }
}
