import java.util.Scanner;
//for count the charracter

public class Program85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "kavya";
        int count = 0 ;
       String b = sc.nextLine();
       char c = b.charAt(0);
        
        for(int i = 0;i<a.length();i++){
           if(a.charAt(i)==c){
            count++;
           } 
        }
        System.out.println(count);
        sc.close();
    }
}
