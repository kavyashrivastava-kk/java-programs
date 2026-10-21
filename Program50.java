import java.util.*;
public class Program50 {
public void sum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int a = sc.nextInt();
    System.out.print("Enter the number : ");
    int b = sc.nextInt();
    int c = a+b;
    System.out.println(c);
    sc.close();
}
public  void sub() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int a = sc.nextInt();
     System.out.print("Enter the number : ");
    int b = sc.nextInt();
    int c = a-b;
    System.out.println(c);
    sc.close();
}
public  void mul() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int a = sc.nextInt();
     System.out.print("Enter the number : ");
    int b = sc.nextInt();
    int c = a*b;
    System.out.println(c);
    sc.close();
}
public void divi() {
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
    Program50 p = new Program50();
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number : ");
    int k = sc.nextInt();
    if(k==1){
       p. sum();
    }
    else if(k==2){
       p. sub();
    }
    else if(k==3){
       p. mul();
    }
    else if(k==4){
        p.divi();
    }
    else{
        System.out.println("invalid");
    }
    sc.close();
}


}
