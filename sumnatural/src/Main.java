import java.util.*;
public class Main {
    public static int sumnatural(int n){
        if(n==1){
            return 1;
        }
        int sum1=sumnatural(n-1);
        int sumnum=n+sumnatural(n-1);
        return sumnum;

    }
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1=fib(n-1);
        int fnm2=fib((n-2));
        int fn=fnm1+fnm2;
        return fn;
    }
    public static void main(String[] args) {
        System.out.println("enter number:");
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int n=26;
      //  System.out.println(sumnatural(n));
       // System.out.println(fib(n));
        System.out.println(fib(27));
        System.out.println(fib(29));
        System.out.println(fib(30));
    }
}