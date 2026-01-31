// Best time to buy & sell stock

package Day04_Arrays_Advanced;

import java.util.Scanner;

    public class problem_02 {
     static void input_array(int[] arr, Scanner sc){
        System.out.println("Enter the elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input_array(arr, sc);
        int min = arr[0];
        int profit = 0;
        for(int i=1; i<n; i++){
            int cost = arr[i] - min;
            profit = Math.max(profit,cost);
            min = Math.min(min,arr[i]);
        }
        System.out.println(profit);
    }
}
// Time complexity = O(n)
// Space Complexity = O(1)