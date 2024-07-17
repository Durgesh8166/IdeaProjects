public class matrix {
    public static void main(String[] args) {
        int arr[][] ={{1,2,3},{2,3,4},{4,7,8}};
        System.out.println("Matrix elements:");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }
        int sum=0;
        System.out.println("sum of matrix  is:");
        for (int i = 0;i<3;i++){
            for (int j = 0;j<3;j++){
                sum=sum+arr[i][j];

            }
        }
        System.out.println(sum);
        int matrix1[][] ={{1,2,3},{2,3,4},{4,7,8}};
        System.out.println("1st Matrix elements:");
        for (int i = 0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix1[i][j]+" ");

            }
            System.out.println();
        }
        int matrix2[][]={{1,1,1},{2,2,2},{3,3,3}};
        System.out.println("2nd Matrix elements:");
        for (int i = 0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        int sub=0;
        System.out.println("Subtract of matrix  is:");
        for (int i = 0;i<3;i++){
            for (int j = 0;j<3;j++){
                sub=matrix1[i][j]-matrix2[i][j];

            }
        }
        System.out.println(sub);
        System.out.println("Diagnoal element:");
        int sum_diagnoal=0;
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if(i==j){
                    System.out.println(matrix2[i][j]);
                    sum_diagnoal=sum_diagnoal+matrix2[i][j];
                }
            }

        }
        System.out.println("sum of diagnoal :");
        System.out.println(sum_diagnoal);
        System.out.println("upper traigular:");
        int sum_upper=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i<j){
                    System.out.println(matrix1[i][j]);
                    sum_upper=sum_upper+matrix1[i][j];
                }

            }

        }
        System.out.println("sum of upper traingular:");
        System.out.println(sum_upper);
        System.out.println("Lower traigular:");
        int sum_Lower=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i>j){
                    System.out.println(matrix1[i][j]);
                    sum_Lower=sum_Lower+matrix1[i][j];
                }

            }

        }
        System.out.println("sum of lower traingular:");
        System.out.println(sum_Lower);
        System.out.println("Multiplication of matrix:");

        int multi_sum=0;
        int matrix3[][]=new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix3[i][j]=0;
                for (int k = 0; k < 3; k++) {
                    multi_sum=multi_sum+matrix1[i][j]*matrix2[i][j];
                    matrix3[i][j]=multi_sum;
                }
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println();

        }

    }
}
