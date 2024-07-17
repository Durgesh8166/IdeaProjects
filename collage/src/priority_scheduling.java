import java.util.*;
class Process{
    int id;
    int BT;
    int priority;
    int waitingTime;
    int turnaroundTime;
    int completionTime;
    Process(int id,int BT,int priority){
        this.id=id;
        this.BT=BT;
        this.priority=priority;
    }
}

public class priority_scheduling {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of process:");
        int n= read.nextInt();
        Process[] processes= new Process[n];
        for (int i = 0; i < n; i++) {
            System.out.println("P"+(i+1)+":");
            int Bt=read.nextInt();
            System.out.print("Enter priority for process " + (i + 1) + ": ");
            int priority = read.nextInt();
            processes[i] = new Process(i + 1, Bt, priority);
        }

        // Sort processes by priority (higher priority first)
        Arrays.sort(processes, Comparator.comparingInt(p -> p.priority));

        // Calculating waiting time and turnaround time
        int currentTime = 0;
        for (int i = 0; i < n; i++) {
            Process process = processes[i];
            process.waitingTime= currentTime;
            process.turnaroundTime = process.waitingTime + process.BT;
            process.completionTime = process.turnaroundTime;
            currentTime += process.BT;
        }

        // Display results
        System.out.println("\nP_ID\tBT\tPrio\t  WT\t  TAT\t  CT");
        for (Process process : processes) {
            System.out.println(process.id + "\t\t" + process.BT + "\t\t" + process.priority + "\t\t" + process.waitingTime + "\t\t" + process.turnaroundTime + "\t\t" + process.completionTime);
        }

        // Generate Gantt chart
        System.out.print("\nGantt Chart:\n|");
        for (Process process : processes) {
            System.out.print(" P" + process.id + " |");
        }
        System.out.print("\n0");
        currentTime = 0;
        for (Process process : processes) {
            currentTime += process.BT;
            System.out.print("   " + currentTime);
        }
    }
}



