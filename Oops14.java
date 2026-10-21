import java.util.Scanner;

class Parent{
    private int id;
    private String name;
   public void setid(int a){
    id = a;
   

   }
   public void getid(){
    System.out.println(id);
   }
   public void setname(String a){
    name = a;
   }
    public void getname(){
    System.out.println(name);
   }

   
   
}
public class Oops14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the id : ");
        int id = sc.nextInt();
        System.out.println("enter the name : ");
        String name = sc.next();
        Parent ob1 = new Parent();

        ob1.setname(name);
        ob1.getname();
        ob1.setid(id);
        ob1.getid();
        

sc.close();

    }
}
