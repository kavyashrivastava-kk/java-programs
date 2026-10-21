import  java.util.*;
public class Program48 {
    public static void num(int a) {
        
        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the numer : ");
        int k = sc.nextInt();
        num(k);
        sc.close();

    }
}
