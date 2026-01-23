// Maximum consecutive ones
package Day5_Array_additional;
import java.util.*;

public class problem_02 {

    static void input_array(int[] arr, Scanner sc){
        System.out.println("Enter the elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    static int Max_consecutive_Ones(int[] arr){
        int count = 0;
        int maxStreak = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                count++;
                maxStreak = Math.max(maxStreak, count);
            }
            else{
                count = 0;
            }
        }
        return maxStreak;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input_array(arr, sc);
        int max_ones_count = Max_consecutive_Ones(arr);
        System.out.println("Maximum consecutive ones in this array is: " +max_ones_count);
    }
}
