import java.util.Scanner;

public class Program45 {
    public static void divi(int a , int b) {
        int c = a/b;
        System.out.println(c);
    }
     public static void mul(int a , int b) {
        int c = a*b;
        System.out.println(c);
    }
     public static void sum(int a , int b) {
        int c = a+b;
        System.out.println(c);
    }
     public static void sub(int a , int b) {
        int c = a-b;
        System.out.println(c);
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no.: ");
        int k = sc.nextInt();
      if (k==1){
        divi(10, 20);
      }
      else if(k==2){
        mul(5, 8);
      }
      else if(k==3){
        sub(5, 12);
      }
      else{
        sum(4, 9);
      }
      sc.close();
    }
}
