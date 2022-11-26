import java.util.ArrayList;

public class FCFS {
    private Queue q = new Queue();
    ArrayList<Process> ganteChart = new ArrayList<>();

    public void add(Process p) {
        q.enqueue(p);
    }

    public void run() {
        int prevExitTime = q.top.data.arrivalTime;
        while (!q.isEmpty()) {
            Process currentProcess = q.dequeue();
            int extraFactor = (prevExitTime < currentProcess.arrivalTime) ? currentProcess.arrivalTime : prevExitTime;
            currentProcess.exitTime = currentProcess.burstTime + extraFactor;
            currentProcess.turnAroundTime = currentProcess.exitTime - currentProcess.arrivalTime;
            currentProcess.waitTime = currentProcess.turnAroundTime - currentProcess.burstTime;
            prevExitTime = currentProcess.exitTime;
            ganteChart.add(currentProcess);
        }
        System.out.println("Processes scheduled sucessfully!");
    }

    public void printChart() {
        System.out.println("\nPid\t AT\t BT\t ET\t TAT\t WT");
        for (Process p : ganteChart) {
            System.out.println(p.id + "\t " + p.arrivalTime + "\t " + p.burstTime + "\t "
                    + p.exitTime + "\t " + p.turnAroundTime + "\t " + p.waitTime
                    + "\t ");
        }
    }
}
