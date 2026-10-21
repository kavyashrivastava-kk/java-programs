import java.util.*;
public class Program30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int a = sc.nextInt();
        int sum = 0;
        int i = 1;
        do{
            sum=i+sum;
            i++;
        }while(i<=a);
        System.out.println(sum);
          sc.close();
    }
}
