import java.util.Scanner;

public class Program68 {
    public static void main(String[] args) {
        int arr[][]=new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2d array elements");
       
        
        for(int k = 0; k<2 ;k++){
            for(int l = 0; l<2;l++){
                 arr[k][l]=sc.nextInt();
            }
            
        }
        for(int i=0;i<2;i++ ){
            for(int j=0;j<2; j++){
                 System.out.print(arr[i][j]);
            }
             System.out.println(" ");
        }
       sc.close();
            
        }
       
    }

