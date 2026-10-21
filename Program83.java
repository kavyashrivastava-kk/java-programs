public class Program83 {
    //for print * int the place of vowels
    public static void main(String[] args) {
        String a = "hello";
        for(int i =0;i<a.length();i++){
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
                System.out.print("*");
            }
            else{
                System.out.print(a.charAt(i));
            }
        }
    }
}
