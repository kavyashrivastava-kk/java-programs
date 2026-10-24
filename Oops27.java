//multi inheritence in interface
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
class kavya implements sd,manager{
     public void frontend(){
        System.out.println("fromnt end complete");
    }
    public  void backend(){
        System.out.println("backend complete");
    }
    public void eat(){
        System.out.println("eating");
    }
    public void nap(){
        System.out.println("sleepiing");
    }
    public void task_assign(){
        System.out.println("assign");
    }
    public void mt(){
        System.out.println("add terms");
    }
    public void  risk_handling(){
            System.out.println("handled");
    }
        
    
}
class Oops27{
    public static void main(String[] args) {
        kavya ob = new kavya();
        ob.backend();
        ob.frontend();
        ob.mt();
        ob.risk_handling();
        ob.task_assign();
        ob.nap();
        ob.eat();
    }
}