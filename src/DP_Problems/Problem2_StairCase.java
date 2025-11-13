package DP_Problems;

import java.util.Scanner;

public class Problem2_StairCase {

    public int maxCostClimbingStairs(int[] cost) {
        int n = cost.length;

        if (n == 1) return cost[0];
        if (n == 2) return Math.max(cost[0], cost[1]);

        int prev2 = cost[0];
        int prev1 = cost[1];

        for (int i = 2; i < n; i++) {
            int curr = cost[i] + Math.max(prev1, prev2);
            prev2 = prev1;
            prev1 = curr;
        }

        return Math.max(prev1, prev2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of steps: ");
        int n = sc.nextInt();

        int[] cost = new int[n];
        System.out.println("Enter the cost of each step:");
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }

        Problem2_StairCase obj = new Problem2_StairCase();
        int result = obj.maxCostClimbingStairs(cost);

        System.out.println("Maximum cost to reach the top = " + result);
        sc.close();
    }
}
