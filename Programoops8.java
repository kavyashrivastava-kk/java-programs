public class Programoops8 {
    //copy constructor
    int age ;
    String name;
    Programoops8 (int age , String name){
        this.age = age;
        this.name =name;
    }
    Programoops8(Programoops8 ref){
        this.age=ref.age;
        this.name=ref.name;
    }
    public static void main(String[] args) {
        Programoops8 ob1 =new Programoops8(19, "kavya");
        System.out.println(ob1.age+" "+ob1.name);
        Programoops8 ob2 = new Programoops8(ob1);
        System.out.println(ob2.age+" "+ob2.name);
    }
}

