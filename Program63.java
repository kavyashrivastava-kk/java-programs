import java.util.Scanner;

public class Program63 {
public static void main(String[] args) {
    int arr[]= new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the array elements : ");
        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        arr[2]=sc.nextInt();
        arr[3]=sc.nextInt();
        arr[4]=sc.nextInt();
        int max = arr[0];
        for(int i = 1;i<=4;i++){
            
            if(arr[i]>=max){
                max = arr[i];
            }

        }
        System.out.println(max);
        sc.close();
}
    
}