import java.util.Scanner;

public class meanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] height = new double[11];
        for (int i = 0; i < 11; i++) {
            height[i]=sc.nextInt();

        }
        double sum=0;
        for (int i = 0; i < 11; i++) {
            sum+=height[i];
        }
        double avgHeight = sum/11;
        System.out.println("Average Height: "+avgHeight);

    }
    
}
