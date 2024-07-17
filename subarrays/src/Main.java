
import java.util.*;

public class Main {
   // public static void subarray(int numbers[]) {
      /*  int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
        }
        System.out.println("total subarray = " + ts);
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10, 12};
        subarray(number);
    }
}*/
  //after correction dj durgesh
    public  static void  subarray(int numbers[]){
        int ts=0;
        for(int i=0;i<numbers.length;i++){
            int start =i;
            for(int j=i;j<numbers.length;j++){
                int end =j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
        }
        System.out.println("total subarray="+ts);
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12};
        subarray(number);
    }
}
