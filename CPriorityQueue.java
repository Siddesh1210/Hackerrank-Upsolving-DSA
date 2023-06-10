import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class CPriorityQueue {
    public static void main(String[] args) {
        Queue<String> pq=new PriorityQueue<>();
        pq.offer("Siddesh");
        pq.offer("Amit");
        pq.offer("Dipesh");
        pq.offer("Rahul");

        System.out.println(pq);
    }
}
