import java.util.*;
public class Program31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int a = sc.nextInt();
      
        int counter =0;
        do{
           a=a/10;
           counter++;
        }while(a!=0);
        System.out.println(counter);
          sc.close();
    }
}
