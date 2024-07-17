import java.util.*;

public class Main {
    public static float getshortestpath(String Path){
        int x=0,y=0;
        for(int i=0;i<Path.length();i++){
            char dir=Path.charAt(i);
            //south
            if(dir == 'S'){
                y--;
            }
            //north
            else if(dir=='N'){
                y++;
            }
            //East
            else if(dir=='E'){
                x++;
            }
            //west
            else if(dir=='W'){
                x--;
            }
            else{
                break;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float) Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String path=" ";
        System.out.println(getshortestpath(path));
    }
}
