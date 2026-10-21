import java.util.Scanner;

public class Program93 {
public static void sum(int a) {
    
    if(a==0){
        return ;
    }
    
    sum(a-1);
    System.out.println(a);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
   sum(a);
   sc.close();
}

}