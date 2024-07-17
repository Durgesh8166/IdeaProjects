public class os22 {
    public static void main(String[] args) {
        int number[]={-1,-5,-6,-8};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++) {
            if (max < number[i]) {
                max=number[i];
            }
        }
        System.out.print(max);
    }
}
