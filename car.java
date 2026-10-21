 class Vehical{
    String name;
    int model;
    void startengine(){
        System.out.println("engine is start");
    }
    void stopengine(){
        System.out.println("engine is stop");
    }
}
 
 
 public class car extends Vehical {
    void seats(int a){
        System.out.println("car has seats : "+a);
    }
    void wiper(){
        System.out.println("wiper is on");
    }
    public static void main(String[] args) {
       car ob = new car();
       ob. startengine();
        ob.seats(5);
        ob.wiper();
        ob.stopengine();
    }
    
}
