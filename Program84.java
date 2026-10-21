public class Program84 {
    //for count spaces
    public static void main(String[] args) {
        String a = "MY NAME IS KAVYA SHRIVASTAVA";
        int space = 0;
        for(int i = 0;i<a.length();i++){
            if(a.charAt(i)==' '){
                 space++;
            }
              
        }
         System.out.println(space);
    }
}
