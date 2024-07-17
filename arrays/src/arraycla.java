import java.util.Scanner;

public class arraycla {
    /* public static void updata(int marks[]){
         for(int i=0;i< marks.length;i++){
             marks[i]=marks[i]+1;
         }
     }
     public static void main(String[] args) {
         int marks[]={98,97,99};
         updata(marks);

     }
 */
   /* public static int linearsearch(int[] number, int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }*/
    public static void reverse(int num[]) {
        int first = 0;
        int last = num.length - 1;
        while (first < last) {
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;
            first++;
            last--;
        }

    }
    public static void printsubarray(int number2[]){
        for(int i=0;i<number2.length;i++){
            int start=i;
            for (int j=0;j<number2.length;j++){
                int end=j;
                for (int k=start;k<=end;k++){
                    System.out.print(number2[k]+" ");
                }
                System.out.println();
            }
        }
    }

    public static void pairofarray(int numerber1[]) {
        for (int i = 0; i < numerber1.length; i++) {
            int curr = numerber1[i];
            for (int j = i+1; j < numerber1.length; j++) {
                System.out.print("(" + curr + "," + numerber1[j] +")");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
      /*  int number[]={2,4,5,67,88,};
      System.out.print("Enter the key you want to search form an array:");
       Scanner sc=new Scanner(System.in);
       int key = sc.nextInt();
       int index=linearsearch(number,key);
       if(index==-1){
           System.out.println("not found");
       }
       else{
           System.out.println("key at index:"+index);
       }

   }
        int num[] = {2, 34, 5, 6, 77};
        reverse(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + " ");
        }
        System.out.println();

    }*/
      //  int number1[] = {2, 3, 5, 56, 7,77,6};
        //pairofarray(number1);
        int number2[]={2,3,4,5,6};
        printsubarray(number2);
    }
}