class parent{
   static int sum(int a ,int b){
    return a+ b;
    }
}
class Oops11 extends parent{
    static int sub(int a,int b){
        return a-b;
    }
    public static void main(String[] args) {
       System.out.println( sum(5, 5));
        
        
       System.out.println(sub(4, 2) );
    }
}