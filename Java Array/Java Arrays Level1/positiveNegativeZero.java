import java.util.Scanner;

public class positiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0; i<5; i++){
            arr[i]=sc.nextInt();
        }
        int first=arr[0];
        int last=arr[4];
        for (int i=0; i<5; i++) {
            if(arr[i]>0){
                if(arr[i]%2==0){
                    System.out.println("Even");
            }else{
                  System.out.println("Odd");
                 }
           }else if(arr[i]<0){
            System.out.println("Negative");
           }else if(arr[i]==0){
            System.out.println("Zero");
           }
        }
        if(first>last){
            System.out.println("First element is greater than last");
        }else  if(first<last){
            System.out.println("First element is less than last");
        }else  if(first==last){
            System.out.println("First element is equal than last");
        }
    }
}
