public class Program39{    public static void main(String[] args) {
    int count = 1;
        for(int i=1;i<=20;i++){
            for(int j=20;j>=i;j--){
                System.out.print(" ");
            }
            for(int k = 1;k<i;k++){
            System.out.print("*");
            count++;
            }
            for(int p=1; p<=i; p++){
                System.out.print("*");
                count++;
            }
            System.out.println();
        }
        
    }
}