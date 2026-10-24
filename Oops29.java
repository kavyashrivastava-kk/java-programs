interface sd{
    public void frontend();
    public void backend();
    public  void eat();
    public void nap();
}
interface manager{
    public void task_assign();
    public void mt();
    public void  risk_handling();
    public void eat();
    public void nap();
}
interface sen_dev extends sd,manager{
    void ceo_call();
}
class kavya implements sen_dev{
     public void frontend(){
        System.out.println("frontend complete");
     }
    public void backend(){
        System.out.println("backend complete");

    }

    public  void ceo_call(){
        System.out.println("kavya talk to  ceo");

    }
    public void task_assign(){
        System.out.println("assigning");

    }
    public void mt(){
        System.out.println("task are managed");

    }
    public void  risk_handling(){
        System.out.println("handled");

    }
    public void eat(){
        System.out.println("eating ");

    }
    public void nap(){
        System.out.println("sleeping");

    }
}
class Oops29 {
    public static void main(String[] args) {
        kavya ob = new kavya();
        ob.backend();
        ob.eat();
        ob.frontend();
        ob.ceo_call();    
        ob.risk_handling();
        ob.mt();
        ob.nap();
        ob.task_assign();
          
    }
}