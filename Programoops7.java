public class Programoops7 {
    //perimeter constructor
    int length;
    int width;
    

    Programoops7(int length,int width){
      this.length = length;
      this.width= width;
    }
    int area(){
     
        return length*width ;

    }
    int perimeter(){
        return 2*length+width;
    }
    public static void main(String[] args) {
        Programoops7 ob1 = new Programoops7(5, 10);
        System.out.println(ob1.area());
        Programoops7 ob2 = new Programoops7(5, 10);
        System.out.println(ob2.perimeter());
          
    }
}
