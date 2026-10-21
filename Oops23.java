abstract class temp{
    String name;
    int model;
    abstract void enginestart();
    temp(String name,int model){
        this.name=name;
        this.model=model;

    }
   
   
}
class car extends temp{
     void enginestart(){
        System.out.println("whoooooooooooooooooooom");

     }
     car(String name,int model){
        super(name,model);
     }
      void display(){
        System.out.println(name+" "+model);
    }
  
}
class bike extends temp{
    void enginestart(){
        System.out.println("shututututtutututututut");
    }
    bike(String name,int model){
       
        super(name,model);
     }
      void display(){
        System.out.println(name+" "+model);
    }

}
public class Oops23 {
    public static void main(String[] args) {
        car ob = new car("alto", 11);
        ob.display();
        ob.enginestart();
    }

    
    
}
