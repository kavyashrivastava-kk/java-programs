class a { 
    a(int a){
        System.out.println(++a);
    }
}
class b extends a {
    int age;
    int id;
    String name;
    b(String name, int id, int age){
        super(5);
        this.age = age;
        this.name = name;
        this.id = id;
    }
}
class Oops16{
    public static void main(String[] args) {
        b ob = new b("Shivam",1,18);

    }
}