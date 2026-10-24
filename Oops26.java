interface car {
     int age =15;
         void  display();
         void name();
    
}
class bike implements car{
     public void display(){
        System.out.println("car");
    }
    public void name(){
        System.out.println("bike");
    }

}


public class Oops26 {
    public static void main(String[] args) {
        bike a = new bike();
        a.display();
        a.name();
    }

    
}