interface ceo{
    void strategy();
    void leadership();
    void eat();
    void nap();

}
interface manager extends ceo{
    void operations();
    void execution();

}
interface head extends ceo{
    void employee_well_being();
    void performance_system();
}
interface employee extends ceo{
    void task_execution();
    void problem_solving();
}
class kavya implements manager{
    public void strategy(){
        System.out.println("sets the company long-term vision,goals, and directions");

    }
    public void leadership(){
        System.out.println("hires and manages the executive team");

    }
    public void eat(){
        System.out.println("eating ");

    }
    public void nap(){
        System.out.println("sleeping");

    }
    public void operations(){
        System.out.println("oversees workflow,monitor projects deadlines,and ensures quality control");

    }
    public void execution(){
        System.out.println("translates high - level corporate strategy into daily actionable tasks");

    }

}
public class Oops31 {
public static void main(String[] args) {
    kavya ob = new kavya();
    ob.leadership();
    ob.nap();
    ob.eat();
    ob.execution();
    ob.operations();
    ob.strategy();
}
    
}
