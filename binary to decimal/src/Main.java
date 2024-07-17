public class Main {
    public static void bintodec(int binnum){
        int pow =0;
        int decNum =0;
        while(binnum!=0){
            int rem = binnum%10;
            decNum=decNum+(rem*(int) Math.pow(2,pow));
            pow++;
            binnum=binnum/10;

        }
        System.out.println("decimal to " +decNum);


    }
    public static void main(String[] args) {
        bintodec(10101011);


        }
}