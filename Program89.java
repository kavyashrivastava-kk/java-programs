public class Program89 {
    //delete space in stringbuilder
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("champion hello world");
        for(int i = 0;i<a.length();i++){
            if(a.charAt(i)==' '){
                a.deleteCharAt(i);
            }
        }
        System.out.println(a);
    }
}
