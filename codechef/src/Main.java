import java.util.Scanner;

class Codechef
{
    public static void main (String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.println("enter t:");
        int t = read.nextInt();

        for(int i=0; i<t; i++)
        {
            System.out.println("enter n:");
            int n = read.nextInt();
            System.out.println(n*2);
        }
    }
}