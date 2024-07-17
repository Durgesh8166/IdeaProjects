import java.util.SortedMap;

interface Ab{
   static void Durgesh(){
        System.out.println("hello");
    }
}
public class Staticexamole implements Ab {
    public static void main(String[] args) {
        //Staticexamole ob=new Staticexamole();
        Ab.Durgesh();
       /* try {
            System.out.println("heeee");
        }
        catch (Exception e){
            e.printStackTrace();
        }*/
    }

}



