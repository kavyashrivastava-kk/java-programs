public class Progam12 {
    public static void main(String[] args) {
        int age = 45 ; 
        int id = 1;
        if(age>=18){
            if(id>0){
                System.out.println("you are eligible");
            }
            else{
                System.out.println("need id proof");
            }
        }
        else{
            System.out.println("not eligible");
        }
    }
}
