import java.util.Scanner;

public class bubbleSort{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        
        int[] marks = new int[size];
        for(int i=0; i<size; i++){
            marks[i]=sc.nextInt();
        }
        for (int i = 0; i < size - 1; i++) {
            boolean swap = false;

            for (int j = 0; j < size - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) break;
        }

        System.out.print("Sorted Marks: ");
        for (int m : marks) {
            System.out.print(m + " ");
        }
    }
}
