class a {
    void show(){
        System.out.println("hi");
    }

}
 class b extends a {
   @Override 
        void show(){
        System.out.println("hello");
    
    }
}
    class Oops20{
        public static void main(String[] args) {
         a ob = new a();
         ob.show();
        }
    }

   

