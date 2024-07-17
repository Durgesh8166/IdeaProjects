import java.util.*;

public class Main {
    public static int binarysearch(int number[],int key) {
        int start = 0, end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

        }

    public static void main(String[] args) {
        int count[]=new int[100];
        Scanner arry = new Scanner(System.in);

        for(int i=0;i<5;i++)
        {
            int number= arry.nextInt();
        }
        System.out.println("enter your number which you want too find");
        int key=arry.nextInt();
        int index = binarysearch(count,key);
        if(index!=1){
            System.out.println("index:" + binarysearch(count,key));
        }
        else {
            System.out.println("not found");
        }
    }

}