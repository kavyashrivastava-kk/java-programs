import java.util.*;
public class Program61{
    public static void main(String[] args) {
        int []arr= new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array elements : ");
       
          
                for(int i = 0;i<=4;i++){
                    arr[i]= sc.nextInt();
                    
                }
            for(int j = 0;j<=4;j++){
                System.out.print(arr[j]+" ");
            }
                sc.close();

    }
}