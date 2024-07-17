public class bottel {
    public static void main(String[] args) {
        int beerNum=99;
        String word = "bottel";
        while (beerNum>0){
            if(beerNum==1) {
                word = "bottel";
            }
                System.out.println(beerNum+" "+word+"of beer on the walll");
            System.out.println(beerNum+" "+word+"of beer");
            System.out.println("Take one down");
            System.out.println("Pass it around");
            beerNum=beerNum-1;

            if(beerNum>0){
                System.out.println(beerNum+" "+word+" of beer on the  wall");
            }
            else {
                System.out.println("No more bottel on the wall");
            }
            }
        }
    }
