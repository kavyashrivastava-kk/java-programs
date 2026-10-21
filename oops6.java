public class oops6 {
   void sum(int a){
    if(a==11){
        return;
    }
    System.out.println(a);
    
    sum(++a);
   }
    public static void main(String[] args) {
        oops6 ob = new oops6();
        ob.sum(5);

    }
}
