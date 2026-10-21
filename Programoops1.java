import java.util.Scanner;

public class Programoops1 {
    int age;
    int rollno;
    String name;
    void sleep(){
        System.out.println(name+" is sleeping");
        
    }
    void put(){
        Scanner put = new Scanner(System.in);
        System.out.println("enter the name ");
         name = put.nextLine();
         System.out.println("enter the roll ");
          rollno = put.nextInt();
          System.out.println("enter the age ");
           age = put.nextInt();
           put.close();
    }
    void get(){
        System.out.println(name);
        System.out.println(rollno);
        System.out.println(age);
    }


    public static void main(String[] args) {
        Programoops1 sc = new Programoops1();
       sc.put();
       sc.get();
        sc.sleep();
        Programoops1 k = new Programoops1();
       k.put();
       k.get();

        k.sleep();
        
       
    }
}

