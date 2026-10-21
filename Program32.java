import java.util.*;
public class Program32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no . : ");
        int a = sc.nextInt();
        int rev= 0;
        int counter= 0;
        do{
            int r = a%10;
            rev = (rev*10)+r;
            a= a/10;

        }while(a!=0);
        System.out.println(rev);
          sc.close();
    }
}
