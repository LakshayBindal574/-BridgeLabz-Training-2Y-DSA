import java.util.Scanner;

public class multiplication6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int num=sc.nextInt();
        int arr[]=new int[4];
        for (int i=6; i<10; i++) {
            arr[i-6]=num*i;
        }
        for (int i=6; i<10; i++) {
            System.out.println(num+" * "+i+" = "+arr[i-6]);
        }
    }
}
