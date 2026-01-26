import java.util.Scanner;

public class countSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = new int[n];

        System.out.println("Enter ages (10 to 18):");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        int[] count = new int[9]; 

        for (int age : ages) {
            count[age - 10]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                ages[index++] = i + 10;
                count[i]--;
            }
        }

        System.out.print("Sorted Ages: ");
        for (int x : ages)
            System.out.print(x + " ");
    }
}
