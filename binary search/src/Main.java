
import  java.util.*;
public class Main {
    public static int binarsearch(int number[],int key) {
        int start = 0;
        int end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if(number[mid]==key){
                return mid;

            }
            if(number[mid]<key){
                start=mid+1;
            }
            else{
               end= mid-1;

            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        Scanner duggu=new Scanner(System.in);
        System.out.println("enter your search key");
        int key =duggu.nextInt();
        System.out.println("index for this:"+binarsearch(number,key));
    }
}