// Find largest element in array
package Day2_Arrays_Basics;
import java.util.Scanner;

public class problem_01{

    static void input_array(int[] arr, Scanner sc){
        System.out.println("Enter the elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    static int maxelement(int[] arr){
        int max = arr[0];
        for(int j=0; j<arr.length; j++){
            if(max < arr[j]){
                max = arr[j];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input_array(arr,sc);
        int max = maxelement(arr);
        
        System.out.println("Largest element of array is: " +max);
        sc.close();
    }
}
// Time complexity = O(n)
// Space Complexity = O(n) [or = O(1) if array is given]
