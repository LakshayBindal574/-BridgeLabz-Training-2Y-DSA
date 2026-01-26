import java.util.Scanner;
public class searchWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] s = new String[n];
        for (int i = 0; i < n; i++)
            s[i] = sc.nextLine();

        String word = sc.nextLine();
        String result = "Not Found";

        for (int i = 0; i < n; i++) {
            if (s[i].contains(word)) {
                result = s[i];
                break;
            }
        }

        System.out.println(result);
    }
}
