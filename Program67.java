import java.util.*;
public class Program67 {
public static void main(String[] args) {
    int arr[]=new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array elements : ");
         arr[0]=sc.nextInt();
          arr[1]=sc.nextInt();
           arr[2]=sc.nextInt();
            arr[3]=sc.nextInt();
             arr[4]=sc.nextInt();
             for(int i = 0 ;i<=4-1;i++){
                for(int j = i;j<=4;j++){
                    if(arr[i]<arr[j]){
                        int temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
             }
             for (int i : arr) {
                System.out.print(i + " ");
             }
             sc.close();
}
    
}