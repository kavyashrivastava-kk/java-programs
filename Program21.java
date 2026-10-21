import java.util.*;
public class Program21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1 ;
        System.out.print("enter the value : ");
        int a = sc.nextInt();
        int mul = 1 ;
        for(i=1;i<=a;i++){
            mul = i*mul;

        }
        System.out.println(mul);
          sc.close();
    }
    
}
