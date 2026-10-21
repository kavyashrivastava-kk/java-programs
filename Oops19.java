//hirrericlse inheritance
class a {
    void sum(){
       
        System.out.println("i am a");
    }
}
class b extends a {
    void sub(){
       
        System.out.println("i am b");
    }
}
class c extends a {
    
    void mul(){
       
        System.out.println("i am c ");
    }
}
class Oops19{
    public static void main(String[] args) {
        c ob = new c ();
        ob.sum();
    }
}