import java.util.*;
public class Main {
    public static int binarysearch(int number[],int key){
        int start=0,end= number.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={154,24,0,20,45};
        Scanner du = new Scanner(System.in);
        System.out.println("enter yor number you want to find");
        int key=du.nextInt();
        System.out.println("index of key is:"+binarysearch(number,key));
    }
}
