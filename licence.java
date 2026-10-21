public class licence {
    int age ;
    licence(){
        age = 18;
    }
    public static void main(String[] args) {
        licence ob1 = new licence();
        ob1.age =19;
        System.out.println(ob1.age);
    }
}
