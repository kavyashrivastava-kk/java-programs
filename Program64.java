import java.util.Scanner;

public class Program64 {
    public static void main(String[] args) {
        int []arr=new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements of array : ");
        for(int i = 0;i<=4;i++){
            arr[i]=sc.nextInt();
        }
        int less = arr[0];
        for(int j = 0 ; j<=4 ;j++){
            if(arr[j]<=less){
                less = arr[j];
            }
        }
        System.out.println("the smaller=st array is : "+less);
        sc.close();
    }
}
