import java.util.*;
class empoloyee{
    int id;
    String name;
    int salary;
    public void printdetails(){
        System.out.println("my id is "+id );
        System.out.println("and name is "+name);
    }
    public int getSalary(){
        return salary;
    }
}
public class oopsss_01_class {
    public static void main(String[] args) {
        empoloyee durgesh= new empoloyee();
        empoloyee joh=new empoloyee();
        durgesh.id=23;
        durgesh.salary=12400;
        durgesh.name="engineer";
        joh.id=1234;
        joh.salary=342;
        joh.name="jona";
        /*System.out.println(durgesh.id);
        System.out.println(durgesh.name);*/

        durgesh.printdetails();
        joh.printdetails();
        int salary=durgesh.getSalary();
        System.out.println(salary);

    }
}
