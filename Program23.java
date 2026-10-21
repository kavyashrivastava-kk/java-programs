import java.util.*;
public class Program23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int a = 0 ; 
          System.out.print("enter the no. : ");
          int b = sc.nextInt();
        while (a<=b) {
            if(a%2==0){
                 System.out.println(a);
            }
           
            a++;
        }
          sc.close();
    }
}
