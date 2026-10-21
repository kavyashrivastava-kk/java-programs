import java.util.*;
public class Program27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no. : ");
        int a = sc.nextInt(); 
        int counter = 0 ;
        while (a!=0){
            a = a/10;
       counter++;
        }
        System.out.println(counter);
          sc.close();
        }
       
}

