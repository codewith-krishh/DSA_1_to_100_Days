// Two Sum(sorted)

package Day09_Two_Pointers;
import java.util.Arrays;
import java.util.Scanner;

public class problem_01 {

    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }


    static void inputArray(int[] arr, Scanner sc){
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }


    static int[] twoSum1(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }


    static int[] twoSum2(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            int needed = target - arr[i];
            int idx = Arrays.binarySearch(arr, i + 1, arr.length, needed);
            if (idx > i) {
                return new int[]{i, idx};
            }
        }
        return new int[]{-1, -1};
    }


    static int[] twoSum3(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        inputArray(arr, sc);
        sc.close();

        // brute force approach
        // time complexity = O(n^2)
        // space complexity = O(1)
        int[] indices1 = twoSum1(arr, target);
        printArray(indices1);


        // better approach
        // time complexity = O(n log n)
        // space complexity = O(1)
        int[] indices2 = twoSum2(arr, target);
        printArray(indices2);


        // optimal approach
        // time complexity = O(n)
        // space complexity = O(1)
        int[] indices3 = twoSum3(arr, target);
        printArray(indices3);
    }
}
