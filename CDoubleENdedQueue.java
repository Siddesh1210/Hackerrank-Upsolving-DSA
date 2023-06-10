import java.util.ArrayDeque;
// import java.util.Queue;

public class CDoubleENdedQueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq=new ArrayDeque<>();

        dq.offer(1);
        dq.offer(2);
        dq.offer(3);
        dq.offer(4);

        dq.offerFirst(10);

        System.out.println(dq);

        dq.pollLast();
        System.out.println(dq);

        


    }
}
