// Count frequency of elements
package Day3_Arrays_Intermediate;

import java.util.Scanner;

public class problem_05 {

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
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == target){
                count++;
            }
        }
        System.out.println("Count frequency of given element is: " +count);

    }
}
// Time complexity = O(n)
// Space Complexity = O(1)