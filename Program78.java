import java.util.Scanner;

public class Program78 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string");
        String a = sc.nextLine();
        int count =0;
        for(int i = 0;i<a.length();i++){
            if(a.charAt(i)=='a' ||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='o'){
                 count++;
            }
          
        }
        System.out.println(count);
        sc.close();
    }
}
