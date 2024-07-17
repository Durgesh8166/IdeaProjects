import java.util.Scanner;

public class os_lab {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of task:");
        int n = read.nextInt();
        int p[] = new int[n];
        System.out.println("Enter the process:");
        for (int i = 0; i < n; i++) {
            p[i] = read.nextInt();
        }
        int At[] = new int[n];
        System.out.println("Enter the Arrivale time:");
        for (int i = 0; i < n; i++) {
            At[i] = read.nextInt();
        }
        int Bt[] = new int[n];
        System.out.println("Enter the Brust time:");
        for (int i = 0; i < n; i++) {
            Bt[i] = read.nextInt();
        }
        int var = 0;
        int CT[] = new int[n];
        System.out.println("CT time:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; i < n; i++) {
                var = var + Bt[i];
                CT[i] = var;
                System.out.println(CT[i]);
            }
        }
        int TAT[] = new int[n];
        int Store_TAT = 0;
        System.out.println("TAT Time:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Store_TAT = CT[i] - At[i];
                TAT[i] = Store_TAT;

            }
            System.out.println(TAT[i]);
        }
        int WT[]=new int[n];
        int store_wt=0;
        System.out.println("Waiting time:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                store_wt=TAT[i]-Bt[i];
                WT[i]=store_wt;

            }
            System.out.println(WT[i]);
        }
        float avg_wt;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+WT[i];
        }
        System.out.println("PI\t AT\t BT\t CT\t TAT WT");
        for (int i = 0; i < n; i++) {
            System.out.println(p[i]+"\t"+At[i]+"\t"+Bt[i]+"\t"+CT[i]+"\t"+TAT[i]+"\t "+WT[i]);
        }

        System.out.println("  ");
        System.out.println("sum of wauting time is:"+sum);
        avg_wt=sum/n;
        System.out.println("Avg time is:  "+avg_wt);
        System.out.println("\nGantt Chart:");
        int time = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("| P" + p[i] + " ");
            for (int j = 0; j < Bt[i]; j++) {
                System.out.print(" ");
            }
            time += Bt[i];
        }
        System.out.println("|");
        System.out.print("0 ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < Bt[i]; j++) {
                System.out.print(" ");
            }
            System.out.print(CT[i] + " ");
        }


    }



}






