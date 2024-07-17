import java.util.Scanner;

public class binary_search01 {
    public static int binary(int number[],int key) {
        int start = 0;
        int end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) {
                return mid;

            } else if (number[mid] < key) {
                end = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[]={2,4,6,8,12,41};
        Scanner find=new Scanner(System.in);
        System.out.println("Enter the key you want to search:");
        int key=find.nextInt();
        System.out.println("index of key is"+binary(number,key));

    }
}
