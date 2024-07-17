import java.io.*;
import java.util.*;
public class sjf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total=0;
        System.out.println("Enter the number of process:");
        int n=input.nextInt();
        int pt[]=new int[n];
        System.out.println("Enter process id:");
        for (int i=0;i<n;i++){
            pt[i]=input.nextInt();
        }
        int At[]=new int[n];
        System.out.println("Enter Arrival time:");
        for (int i=0;i<n;i++){
            At[i]=input.nextInt();
        }
        int Brush_t[][]=new int[n][n];
        System.out.println("Enter brust time:");
        for (int i = 0; i < n; i++) {
            System.out.print("P" + (i + 1) + ": ");
            Brush_t[i][1] = input.nextInt();
            Brush_t[i][0] = i + 1;
        }

            for (int i = 0; i < n; i++) {
                // Sorting process according to their
                // Burst Time.
                int index = i;
                for (int j = i + 1; j < n; j++) {
                    if (Brush_t[j][1] < Brush_t[index][1]) {
                        index = j;
                    }
                }
                int temp = Brush_t[i][1];
                Brush_t[i][1] = Brush_t[index][1];
                Brush_t[index][1] = temp;
                temp = Brush_t[i][0];
                Brush_t[i][0] = Brush_t[index][0];
                Brush_t[index][0] = temp;
            }
            Brush_t[0][2] = 0;
            // Calculation of Waiting Times
            for (int i = 1; i < n; i++) {
                Brush_t[i][2] = 0;
                for (int j = 0; j < i; j++) {
                    Brush_t[i][2] += Brush_t[j][1];
                }
                total += Brush_t[i][2];
            }
            float avg_wt,avg_tat;

            avg_wt = (float)total / n;
            total = 0;
            // Calculation of Turn Around Time and printing the
            // data.
            System.out.println("P\tBT\tWT\tTAT");
            for (int i = 0; i < n; i++) {
                Brush_t[i][3] = Brush_t[i][1] + Brush_t[i][2];
                total += Brush_t[i][3];
                System.out.println("P" +Brush_t[i][0] + "\t"
                        + Brush_t[i][1] + "\t" + Brush_t[i][2]
                        + "\t" + Brush_t[i][3]);
            }
            avg_tat = (float)total / n;
            System.out.println("Average Waiting Time= "
                    + avg_wt);
            System.out.println("Average Turnaround Time= "
                    + avg_tat);
        System.out.println("Gantt Chart:");

        int currentTime = 0;
        int totalBurstTime = 0;
        for (int i = 0; i < n; i++) {
            totalBurstTime += Brush_t[i][1];
        }

        while (currentTime < totalBurstTime) {
            int shortestProcessIndex = -1;
            int shortestBurstTime = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (Brush_t[i][1] > 0 && At[i] <= currentTime && Brush_t[i][1] < shortestBurstTime) {
                    shortestProcessIndex = i;
                    shortestBurstTime =Brush_t[i][1];
                }
            }

            if (shortestProcessIndex == -1) {
                System.out.print("IDLE ");
                currentTime++;
                continue;
            }

            System.out.print("P" + Brush_t[shortestProcessIndex][0] + " ");
            Brush_t[shortestProcessIndex][1]--;
            currentTime++;
        }

        System.out.println("|" + totalBurstTime);
    }
}
