public class Program87 { 
    //for reverse the Stringbuilder
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("kavya");
       StringBuilder rev = new StringBuilder(" ");
       for(int i =a.length()-1;i>=0;i--){
        rev.append(a.charAt(i));
       }
       System.out.println(rev);
    }
}
