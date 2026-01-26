import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[10];
        for (int i=1; i<=10; i++) {
            arr[i-1]=num*i;
        }
        for (int i=1; i<=10; i++) {
            System.out.println(num+" * "+i+" = "+arr[i-1]);
        }

    }
}
