public class Main {
    public static int linearSearch(String[] number, String key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int number[] = {2, 4, 67, 8};
        int key = 2;
        String menu[]={"dosa","chawmin","momos","tikiya","...."};
        String r="....";
      //  int index = linearSearch(number,key);
        int index=linearSearch(menu,r);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("key is at index:" + index);
        }
    }

    }


