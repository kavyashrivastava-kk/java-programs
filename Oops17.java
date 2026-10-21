class Student { 
    int age;
    int id;
    String name;
    Student(String name,int age,int id){
        this.age = age;
        this.name = name;
        this.id = id;
    }
    void display(){
        System.out.println(name+" "+age+" "+id);
        
    }
}
class Kavya extends Student {
   String hobby;
   void display(){
    System.out.println(name+" "+age+" "+id+" "+hobby);
        
   }
    Kavya(String name, int id, int age, String hobby){
        super(name,age,id);
        
        this.hobby = hobby;
    }
}
class Shivam extends Student {
    int running;

    void display(){
    System.out.println(name+" "+age+" "+id+" "+running);
        
   }
    Shivam(String name , int id ,int age,int running){

        super(name, age , id );

        this.running = running;

      


    }
}


class Oops17{
    public static void main(String[] args) {
        Kavya ob = new Kavya("kavya",1,19,"football");
        Shivam ob1 = new Shivam("shivam",2,27,15);
        ob1.display();
        ob.display();

    }
}
