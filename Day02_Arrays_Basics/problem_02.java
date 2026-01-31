// Second largest element
package Day02_Arrays_Basics;
import java.util.Scanner;

public class problem_02 {

    static void input_array(int[] arr, Scanner sc){
        System.out.println("Enter the elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }


    static int second_maxelement(int[] arr){
        int max = arr[0];
        int second_max = Integer.MIN_VALUE;
        for(int j=1; j<arr.length; j++){
            if(arr[j] > max){
                second_max = max;
                max = arr[j];
            }
            else if(arr[j] < max && arr[j] > second_max){
                second_max = arr[j];
            }
        }
        return second_max;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input_array(arr,sc);
        int second_max = second_maxelement(arr);
        
        System.out.println("Second largest element of array is: " +second_max);
        sc.close();

    }
}
// Time complexity = O(n)
// Space Complexity = O(1)
