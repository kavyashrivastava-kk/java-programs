import java.util.Scanner;

public class Program73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if (a.equals(b)){
            System.out.println("a equals to b");
        }
        else{
            System.out.println("not equals");
            sc.close();
        }
    }
}
