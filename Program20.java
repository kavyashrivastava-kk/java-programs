import java.util.*;
public class Program20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1 ; 
        System.out.print("enter the value : ");
        int a = sc.nextInt();
         int sum=0;
        for(i=1;i<=a;i++){
            if(i%5==0){
                sum = i+sum;
            }
           
        }
         System.out.println(sum);
           sc.close();
    }
}
