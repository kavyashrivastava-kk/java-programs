public class Program8 {
    public static void main(String[] args) {
        int p = 200 ; 
        int s = 300 ;
        if(p>=s){
            System.out.println("loss");
            System.out.println("loss : "+(p-s));
        }
        else{
            System.out.println("profit");
            System.out.println("profit : "+(s-p));
        }
    }
}
