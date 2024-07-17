public class test {
    public void m1(float f)
    {
         System.out.println("float-arg");
     }
     public void m1(int i)
    {
        System.out.println("int-arg");
    }
    public void m1(double d)
    {
        System.out.println("double");
    }

     public static void main(String[] args) {
        test t = new test();
        t.m1(15.0);

     }
}
