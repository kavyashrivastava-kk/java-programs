import java.util.Scanner;

class Programoops2{
   static  float length ;
   static  float width;

     static void area() {
      float a =  length*width;
      System.out.println(a);
      return;  
    }

      static void perimeter(){
      float a =  2*(length*width);
      System.out.println(a);
      return ;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length : ");
        length = sc.nextFloat();
        System.out.println("enter the width : ");
        width = sc.nextFloat();
        area();

        System.out.println("enter the length : ");
        length = sc.nextFloat();
        System.out.println("enter the width : ");
        width = sc.nextFloat();
        perimeter();
       
        
        sc.close();
        
    }


}