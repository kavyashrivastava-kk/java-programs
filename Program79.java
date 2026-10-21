import java.util.Scanner;
//reverse the string without using reverse function
public class Program79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String a = sc. nextLine();
        String rev = "" ;
        for(int i = a.length()-1;i>=0;i--){
            
            rev = rev+ a.charAt(i);
        }
         System.out.println(rev);
         sc.close();
    }
}
