import java.util.*;
public class Program25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1 ; 
        System.out.println("enter the no. : ");
        int b = sc.nextInt();
        int mul = 1 ; 
        while (a<=b) {
            mul = a * mul ; 
            a++;
        }
          sc.close();
        System.out.println(mul);
    }
}
