import java.io.*;
import java.util.Arrays;
class Test
{
    static private void  second_largest(int[] arr, int n)
    {
        if (n == 0 || n==1)
        {
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
        }
        Arrays.sort(arr);
        int small = arr[1];
        int large = arr[n - 2];
        System.out.println("Second smallest is "+small);
        System.out.println("Second largest is "+large);
    }
    public static void main(String[] args)
    {
        int[] arr = {-1,-4,-6,-3};
        int n = arr.length;
        second_largest(arr, n);
    }
}
