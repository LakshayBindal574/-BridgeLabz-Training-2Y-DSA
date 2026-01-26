import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] num = new double[10];
        double total=0.0;
        int index=0;
        while(true){
            System.out.println("Enter a num");
            double input=sc.nextDouble();
            if(input<=0){
                break;
            }if(index==10){
                break;
            }
            num[index]=input;
            index++;

        }
        for(int i=0; i<index; i++){
            total+=num[i];
        }
        System.out.println("Sum of array is "+total);


    }
}
