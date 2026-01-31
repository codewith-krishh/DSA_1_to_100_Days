// Reverse an array using recursion

package Day12_Functional_vs_Parameterized;
import java.util.Scanner;

public class problem_03 {

    static void reverseArray(int[] arr,int left, int right){
        if(left >= right) return;

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverseArray(arr, left+1, right-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        reverseArray(arr, 0, arr.length-1);

        System.out.println("Reverse of this array is: ");
        for(int i=0; i<arr.length; i++){
           System.out.print(arr[i] + " ");
        }


        sc.close();
    }
}

// time complexity = O(n)
// space complexity = O(n) {due to recursive stack}