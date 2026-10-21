import java.util.Scanner;
//user authentication to acess the data
class student{
    private int Age;
    private String name;
    private int marks;
    private String pass ="Kavya@810355";
    public void setAge(String pass ,String name,int Age ,int marks ) {
        if(this.pass.equals(pass)){
             this.Age = Age;
             this.name=name;
             this.marks=marks;

        }
        else{
            System.out.println("pass is incorrect");
        }
        
       
    }
    public void getAge(String pass){
        if(this.pass.equals(pass)){
            System.out.println("Name is :"+name+" "+"Age is : "+Age+" "+"Marks are : "+" "+marks);
        }
        else{
            System.err.println("you can't access the data");
        }
            
        }
}
public class teacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student ob1 = new student();
        System.out.println("enter the pass : ");
        String pass = sc.nextLine();
        System.out.println("enter the name : ");
        String name = sc.next();
        System.out.println("enter the age : ");
        int Age = sc.nextInt();
        System.out.println("enter the marks : ");
        int marks = sc.nextInt();
       
        ob1.setAge(pass,name,Age,marks);
        ob1.getAge(pass);
        sc.close();
        
    }
}
