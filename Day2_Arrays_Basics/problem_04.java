// Sum of array elements
package Day2_Arrays_Basics;

import java.util.Scanner;

public class problem_04 {

    static void input_array(int[] arr, Scanner sc){
        System.out.println("Enter the elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    } 

    static int SumOfArray(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input_array(arr,sc);
        int sum = SumOfArray(arr);
        System.out.println("Sum of elements is: "+sum);
        sc.close();       
    }
}
// Time complexity = O(n)
// Space Complexity = O(n) [or = O(1) if array is given]