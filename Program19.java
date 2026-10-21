import java.util.*;

public class Program19 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 1;
    System.out.print("enter the no . : ");
    int a = sc.nextInt();
    for(i=1;i<=a;i++){
        if(i%4==0){
             System.out.println(i);
        }
       
    }
      sc.close();

}
    
}