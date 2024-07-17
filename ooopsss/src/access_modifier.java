import java.util.*;
class emplee{
   private int id;
     private String name;
     public String getname(){
         return name;
     }

     public void setName( String n){
         name=n;
     }
     public int getId(){
         return id;
     }
     public int setId(){
         return id;
     }

}

public class access_modifier {
    public static void main(String[]args){
        emplee durgesh= new emplee();
        durgesh.setName("durgeshhh");
        System.out.println(durgesh.getname());
    }


}
