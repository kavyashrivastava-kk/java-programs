import java.util.Scanner;

public class Program72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name");
        String name = sc.nextLine();
        System.out.println("enter the fees");
        float fees= sc.nextFloat();
        System.out.println("enter the age");
        int age = sc.nextInt();
        System.out.println("enter the collage name");
        String collage ;
        collage = sc.next();
        
        
        System.out.println("this is  name : "+name);
        System.out.println("this is fees : "+fees);
        System.out.println("this is age : "+age);
        System.out.println("this is collage name : "+collage);
        sc.close();
    }
}
