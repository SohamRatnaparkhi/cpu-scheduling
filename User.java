import java.util.*;

public class User {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        FirstComeFirstServe();
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

}

/*
 * tc 1
p0 0 14
p1 1 3
p2 2 1
p3 3 2
p4 4 5
 * tc 2
a 3 4
b 5 3
c 0 2
d 5 1
e 4 3
*tc3
p0 6 4
p1 2 5
p2 3 3
p3 1 1
p4 4 2
p5 5 6
 */