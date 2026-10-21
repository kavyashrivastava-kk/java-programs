import java.util.Scanner;
//for check pallindrone in string

public class Program80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String rev = "";
        for(int i = a.length()-1 ; i>=0;i--){
            rev = rev+a.charAt(i);
            }
            if(a.equals(rev)){
                System.out.println("pallindrome");
            }
            else{
                System.out.println("not pallindrome");
            }
            sc.close();
        }
    }

