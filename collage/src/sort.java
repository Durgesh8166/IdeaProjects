public class sort {
    public static void main(String[] args) {
        int arr1[]={1,2,4,6};
        for (int i = 0; i < arr1.length; i++) {
            for (int j =i+1; j <arr1.length; j++) {
                if(arr1[i]>arr1[j]){
                    int tem=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=tem;
                }

            }
        }
        System.out.println("Sorted array");
        for (int i = 0; i < arr1.length; i++) {

            System.out.print(arr1[i]+ "  ");


        }
        System.out.println();
        System.out.println("laregst:");
        System.out.println(arr1[arr1.length-1]);
        int arr2[]={8,6,9,4,3};
        System.out.println("max of aaray:"+ maxnumber(arr2));

            }
            public static int  maxnumber(int arr[]){
        int max=arr[0];
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i]>max){
                        max=arr[i];
                    }

                }
                return max;

            }

        }
