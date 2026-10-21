class vehical {
    String name;
    int model;
   vehical(String name ,int model){
     this.name=name;
     this.model=model;
   }
    void enginestart(){
        System.out.println("engine is on ");
    }
    void enginestop(){
        System.out.println("engine is off");
    }
    void display(){
        System.out.println(name+" "+model);
    }
}
class car extends vehical {
    int Staring;
    int gear;
    void ac(){
        System.out.println("ac is on");
    }
    void display(){
        System.out.println(name+" "+model+" "+Staring+" "+gear);
    }
     car( String name , int model,int gear, int Staring){
         super(name, model);
         this.Staring=Staring;
         this.gear=gear;



    }
}
class bike extends vehical{
    int handle ;
    void wheelie(){
        System.out.println("one tyre wheelie");
    }
     void display(){
        System.out.println(name+" "+model+" "+handle);
    }
     bike( String name , int model,int gear, int handle){
         super(name, model);
         this.handle=handle;
         
    }
}
class Oops21{
    public static void main(String[] args) {
      bike ob = new bike("activa", 12, 4, 180);
      car ob1 = new car("alto", 11, 5, 360);
      ob.display();
      ob.wheelie();
      ob1.display();
       ob1.ac();


    }
}