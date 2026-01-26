import java.util.Scanner;

public class insertionSortID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        
        int[] ids = new int[size];
        for(int i=0; i<size; i++){
            ids[i]=sc.nextInt();
        }
        for (int i = 1; i < ids.length; i++) {
            int key = ids[i];
            int j = i - 1;

            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }
            ids[j + 1] = key;
        }

        System.out.print("Sorted Employee IDs: ");
        for (int id : ids) {
            System.out.print(id + " ");
        }
    }
}
