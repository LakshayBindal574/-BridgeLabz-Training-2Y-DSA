import java.util.Scanner;
public class search2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] m = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = sc.nextInt();

        int target = sc.nextInt();
        int left = 0, right = r * c - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;
            int row = mid / c;
            int col = mid % c;

            if (m[row][col] == target) {
                found = true;
                break;
            }
            if (m[row][col] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        System.out.println(found);
    }
}
