import java.util.*;

public class QueueJavaFramework {

    public static void main(String[] args) {
        // Queue q = new Queue(5);

        Queue<Integer> q = new LinkedList<>();
        // queue is just a interface in java not a class
        // objects are just made for classes....
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
