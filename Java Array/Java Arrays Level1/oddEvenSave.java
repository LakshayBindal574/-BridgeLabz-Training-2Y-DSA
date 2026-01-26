import java.util.Scanner;

public class oddEvenSave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Error Enter Natural Number!");
            return;
        }

        int size = num / 2 + 1;
        int[] odd = new int[size];
        int[] even = new int[size];

        int oddIndex = 0, evenIndex = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                even[evenIndex++] = i;
            } else {
                odd[oddIndex++] = i;
            }
        }

        System.out.print("Odd number: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.print("Even number: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
    }
}