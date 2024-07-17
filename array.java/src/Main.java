import java.util.*;
public class Main {
    public static void main(String[] args) {
        int marks[]=new int[15];
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]= sc.nextInt();
        marks[3]= sc.nextInt();
        System.out.println("phy:"+marks[0]);
        System.out.println("che:"+marks[1]);
        System.out.println("maths"+marks[3]);
        marks[1]=100;
        marks[3]=marks[3]+4;
        System.out.println("che:"+marks[1]);
        System.out.println("math:"+marks[3]);
        int sum=(marks[0]+marks[1]+marks[3]);
        System.out.println("sum="+sum);
        int percentage =(marks[0]+marks[1]+marks[3])/3;
        System.out.println("percentage="+percentage+"%");
        System.out.println("lenth of arry="+marks.length);
    }
}