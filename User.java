import java.util.*;

public class User {
    public static void main(String[] args) {
        FCFS fcfs = new FCFS();
        int x = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pid, AT, BT");
        while (x-- > 0) {
            String pid = sc.next();
            int at = sc.nextInt();
            int bt = sc.nextInt();
            Process current = new Process(pid, at, bt);
            fcfs.add(current);
        }
        fcfs.run();
        fcfs.printChart();
    }
}

/*
 * tc 1
p0 0 14
p1 1 3
p2 2 1
p3 3 2
p4 4 5
 */