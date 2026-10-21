import java.util.*;
public class Program24 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 1;
    System.out.print("enter the no. : ");
    int b = sc.nextInt();
    int sum = 0 ; 
    while (a<=b) {
        sum = a + sum ; 
        a++;
    }
    System.out.println(sum);
      sc.close();
}
    
}
