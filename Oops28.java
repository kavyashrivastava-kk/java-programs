interface bird {
    void wings();
    void area();

}
class eagle implements bird{
    String name;
    int age;
    String size;
    String eat;
    public void wings(){
        System.out.println("big");
    }
    public void area(){
        System.out.println("north");
    }
    eagle(String name ,int age , String size,String eat){
        this.name = name;
        this.age = age;
        this.size = size;
        this.eat =eat;

    }
    void display(){
        System.out.println("this is name = "+name+" this is age = "+age+" this is size = "+size+" meal = "+eat);
    }

}
class pigeon implements bird{
    String name;
    int age;
    String size;
    String nature;
    public void wings(){
        System.out.println("small");
    }
    public void area(){
        System.out.println("north/east");
    }
    pigeon(String name ,int age , String size ,String nature){
        this.name = name;
        this.age = age;
        this.size = size;
        this.nature =nature;
        

    }
    void display(){
        System.out.println("this is name = "+name+" this is age = "+age+" this is size = "+size+" type of nature = "+nature);
    }

}
class penguine implements bird{
    String name;
    int age;
    String size;
    String enviroment;
    
    public void wings(){
        System.out.println(" penguine has wings but do not able to fly ");
    }
    public void area(){
        System.out.println("south pole");
    }
    penguine(String name ,int age , String size,String enviroment){
        this.name = name;
        this.age = age;
        this.size = size;
        this.enviroment=enviroment;
        

    }
    void display(){
        System.out.println("this is name = "+name+" this is age = "+age+" this is size = "+size+" lives in = "+enviroment);
    }

}
class duck implements bird{
    
    String name;
    int age;
    String size;
    String type;
    public void wings(){
        System.out.println("moderate");
    }
    public void area(){
        System.out.println("everywhere");
    }
    duck(String name ,int age , String size,String type){
        this.name = name;
        this.age = age;
        this.size = size;
        this.type =type;

    }
    void display(){
        System.out.println("this is name = "+name+" this is age = "+age+" this is size = "+size+" type of it = "+type);
    }

}
class Oops28{
    
    public static void main(String[] args) {
        duck ob = new duck("sea water duck", 15, "medim", "water/land/fly");
        ob.display();
        ob.wings();
        ob.area();
        
        pigeon ob1 = new pigeon("black feather pigeon", 5, "small", "calm");
        ob1.display();
        ob1.wings();
        ob1.area();

        eagle ob2 = new eagle("desert eagle", 25, "big", "non-veg");
        ob2.display();
        ob2.wings();
        ob2.area();

        penguine ob3 = new penguine("black sea penguine", 12, "moderate", "cold");
        ob3.display();
        ob3.wings();
        ob3.area();

    }
   

}
