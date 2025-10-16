package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class first {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println("Queue elements: " + q);
        System.out.println("Peak element in the queue : "+q.peek());
        q.remove();// This will remove the 0th position element in the queue.......
        System.out.println(q);
        q.remove(2);// This will remove the particular the from the queue.....
        System.out.println(q);
        System.out.println(q.size());// This will return the size of the array....
        System.out.println(q.contains(2));// THis will return the boolean value that the element is present in the queue or not....
    }
}
