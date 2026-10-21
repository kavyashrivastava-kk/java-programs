import java.util.*;
public class Program28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enetr the no : ");
        int n = sc.nextInt();
        int counter = 0 ;
        int rev = 0 ;
        while (n!=0) {
            int r = n%10;
            rev = (rev*10)+r;
          n=n/10  ;
          
        }
      System.out.println(rev);
        sc.close();
    }
}
