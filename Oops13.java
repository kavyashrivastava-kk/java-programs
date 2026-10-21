public class Oops13 {
    int a;
    int b;
    int c;
    int d;
    Oops13(int a ,int b ,int c){
        System.out.println(a+b+c);
    }
    Oops13(int a ,int b ){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Oops13 ob1 = new Oops13(12, 10);
    }
}
