class a {
    void show(){
        System.out.println("hi");
    }

}
public class b extends a {
   
        void show(){
        System.out.println("hello");
    
    }
    class Oops20{
        public static void main(String[] args) {
         b ob = new b();
         ob.show();
        }
    }

   
}
