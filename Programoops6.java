

public class Programoops6 {
    String name;
    int age;
    String collage;
    float fees;

    Programoops6(String name,int age,String collage,float fees){
       this.name = name;
        this.age = age;
        this.collage = collage;
       this.fees = fees;

        
    }
    public static void main(String[] args) {
        Programoops6 ob1 = new Programoops6("kavya", 19, "itm university",  32000);
        System.out.println(ob1.name+" "+ob1.age+" "+ob1.collage+" "+ob1.fees);
        Programoops6 ob2 = new Programoops6("shivam", 21, "vikrant university", 30000);
        System.out.println(ob2.name+" "+ob2.age+" "+ob2.collage+" "+ob2.fees);
       
    }
}
