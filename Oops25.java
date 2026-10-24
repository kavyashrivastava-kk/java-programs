abstract class bird{
    String name;
    String size;
    int high;
    abstract void wings();
    abstract void area();
    bird(String name,String size,int high){
        this.name= name;
        this.size =size;
        this.high = high;

    }
    
}
class eagle extends bird{
    String eat;
    void wings(){
        System.out.println("wings = large");
    }
    void area(){
        System.out.println("north");

    }
     eagle(String name,String size, int high,String eat){
        super(name,size,high);
        this.eat=eat;

    }
    void display(){
        System.out.println(name+" "+size+" "+high+" "+eat);
    }
}
class penguine extends bird{ 
    String enviorment;
    void wings(){
        System.out.println("wings = no");
    }
    void area(){
        System.out.println("Southpole");

    }
     penguine(String name,String size, int high,String enviorment){
        super(name,size,high);
        this.enviorment = enviorment;

    }
     void display(){
        System.out.println(name+" "+size+" "+high+" "+enviorment);
    }
}
class pigeon extends bird{

    void wings(){
        System.out.println("wings = medium");
    }
    void area(){
        System.out.println("north/east");

    }
     pigeon(String name,String size, int high){
        super(name,size,high);

    }
     void display(){
        System.out.println(name+" "+size+" "+high);
    }
}
class duck extends bird{
    String type;
    void wings(){
        System.out.println("wings = moderate");
    }
    void area(){
        System.out.println("everyWhere");

    }
     duck(String name,String size, int high,String type){
        super(name,size,high);
        this.type = type;

    }
     void display(){
        System.out.println(name+" "+size+" "+high+" "+type);
    }
}
 class Oops25{
    static void birdstuff(bird b){
        b.wings();
        b.area();

    }
    public static void main(String[] args) {
      pigeon ob1 =  new pigeon("white", "medium", 5);
        birdstuff(ob1);
        
        birdstuff(new eagle("red ", "moderate", 70, "non veg"));
       
    }
 }

