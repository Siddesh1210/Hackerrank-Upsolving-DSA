import java.util.LinkedList;
import java.util.Queue;

public class CQueueLL {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println(queue);

        queue.remove(3);
        // queue.clear();
        System.out.println(queue.size());

        System.out.println(queue);

    }
}
