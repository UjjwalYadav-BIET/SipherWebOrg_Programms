package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// Wap to print the dynamic queue......
public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        System.out.print("Enter the number of elements you want to add: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            queue.add(element);  // enqueue operation
        }
        System.out.println("\nThe Queue elements are: " + queue);
        System.out.println("Queue elements (front to rear):");
        for (int val : queue) {
            System.out.print(val + " ");
        }
    }
}
