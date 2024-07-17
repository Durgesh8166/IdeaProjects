import java.util.*;
class empoloyee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}
class cellphone{

}
public class oopsss_practice_02_class {
    public static void main(String[] args) {
        empoloyee1 durgesh= new empoloyee1();
        durgesh.setName("Durgesh");
        durgesh.salary=123;
        System.out.println(durgesh.getName());
        System.out.println(durgesh.getSalary());

    }
}
