import java.util.Scanner;

public class Stringarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String []arr= new String[5];
        for(int i=0; i<=4; i++){
            arr[i] = sc.nextLine();
        }
       for (String s : arr) {
        System.out.print(" "+s);
       }
       sc.close();
    }
}
