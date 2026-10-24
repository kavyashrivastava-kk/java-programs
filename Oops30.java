interface employee{
   void working();
   void eat();
   void nap();

}
interface head extends employee{
    void dead_line();
    void task_assign();

}
interface manager extends head{
    void manage_task();
    void supervision();
}
interface ceo extends manager{
    void controlling();
}
class kavya implements ceo{
   public  void working(){
    System.out.println("work done");

   }
public void eat(){
    System.out.println("eating");
   }
public void nap(){
    System.out.println("sleeping");

  }
public void dead_line(){
    System.out.println("dead line  end");

  }
public void task_assign(){
    System.out.println("assigning");

    }
public  void manage_task(){
    System.out.println("tasks giveing");

     }
public  void supervision(){
    System.out.println("supervise");

   }
public  void controlling(){
    System.out.println("company is controlled ");

   }
}

public class Oops30{
    public static void main(String[] args) {
        kavya ob = new kavya();
        ob.controlling();
        ob.dead_line();
        ob.eat();
        ob.nap();
        ob.supervision();
        ob.task_assign();
        ob.manage_task();
        ob.working();
    }
}