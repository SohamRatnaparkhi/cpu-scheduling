import java.util.*;

public class User {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // FirstComeFirstServe();
        ShortestJobFirst();
    }

    private static void FirstComeFirstServe() {
        FCFS fcfs = new FCFS();
        System.out.print("Enter number of processes - ");
        int processes = sc.nextInt();
        System.out.println("Enter pid, AT, BT");
        // int priority = 0;
        while (processes-- > 0) {
            String pid = sc.next();
            int at = sc.nextInt();
            int bt = sc.nextInt();
            Process current = new Process(pid, at, bt);
            current.priority = current.arrivalTime;
            fcfs.add(current);
            // priority++;
        }
        fcfs.run();
        fcfs.printChart();
        fcfs.ganteChart();
    }
    private static void ShortestJobFirst() {
        SJF sjf = new SJF();
        System.out.print("Enter number of processes - ");
        int processes = sc.nextInt();
        System.out.println("Enter pid, AT, BT");
        // int priority = 0;
        while (processes-- > 0) {
            String pid = sc.next();
            int at = sc.nextInt();
            int bt = sc.nextInt();
            Process current = new Process(pid, at, bt);
            sjf.add(current);
            // current.priority = current.arrivalTime;
            // priority++;
        }
        sjf.run();
        sjf.printChart();
        sjf.ganteChart();
    }

}
