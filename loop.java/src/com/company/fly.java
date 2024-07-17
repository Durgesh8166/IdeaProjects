package com.company;

public class fly {
    public static void main(int n){
        for(int i=1; i<=n;i++){
            for( int j=1;j<=1;j++) {
                System.out.println("x");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.println(" ");
            }
            for(int j = 1; j <= n; j++) {
                System.out.println("x");
            }
        }
    }
}


