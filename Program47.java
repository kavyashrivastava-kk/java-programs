import java.util.*;
public class Program47 {
public static void sum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int a = sc.nextInt();
    System.out.print("Enter the number : ");
    int b = sc.nextInt();
    int c = a+b;
    System.out.println(c);
    sc.close();
}
public static void sub() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int a = sc.nextInt();
     System.out.print("Enter the number : ");
    int b = sc.nextInt();
    int c = a-b;
    System.out.println(c);
    sc.close();
}
public static void mul() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int a = sc.nextInt();
     System.out.print("Enter the number : ");
    int b = sc.nextInt();
    int c = a*b;
    System.out.println(c);
    sc.close();
}
public static void divi() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int a = sc.nextInt();
     System.out.print("Enter the number : ");
    int b = sc.nextInt();
    int c = a/b;
    System.out.println(c);
    sc.close();

}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number : ");
    int k = sc.nextInt();
    if(k==1){
        sum();
    }
    else if(k==2){
        sub();
    }
    else if(k==3){
        mul();
    }
    else if(k==4){
        divi();
    }
    else{
        System.out.println("invalid");
    }
    sc.close();
}


}
