import java.util.Scanner;

public class binearySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int left = 0, right = n - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (a[mid] > a[right])
                left = mid + 1;
            else
                right = mid;
        }

        System.out.println(left);
    }
}
