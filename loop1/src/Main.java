import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaan = new Scanner(System.in);
        int n = scaan.nextInt();
        for(int i=1;i<=10;i++){
            int result = n*i;
            System.out.printf("%d x %d = %d\n",n,i,result);
        }
    }
}