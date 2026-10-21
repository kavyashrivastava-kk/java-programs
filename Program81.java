public class Program81 {
    //for check pallindrome in Stringbuilder
    public static void main(String[] args) {
       StringBuilder a = new StringBuilder("naman");
       StringBuilder b = a;
      a.reverse();
      if(a.equals(b)){
        System.out.println("pallindrome");
      }
else{
    System.out.println("not pallindrome");
}
        }
      

    }

