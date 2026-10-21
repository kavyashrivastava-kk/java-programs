public class Program11 {
    public static void main(String[] args) {
        int a = 11 ; 
        if(a>0){
            if(a%2==0){
                System.out.println("even positive");
            }
            else{
                System.out.println("odd positive");
            }
        }
        else{
            if(a%2==0){
                System.out.println("even negative");
            }
            else{
                System.out.println("odd negative");
            }
        }
    }
}
