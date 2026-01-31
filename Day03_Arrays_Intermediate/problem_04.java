// Missing number;
package Day3_Arrays_Intermediate;
import java.util.Scanner;

public class problem_04 {

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
        int[] arr = new int[n-1];
        input_array(arr, sc);

        // Brute force approach
        // for(int i=1; i<=n; i++){
        // int flag = 0;
        //     for(int j=0; j<arr.length; j++){
        //         if(arr[j] == i){
        //             flag = 1;
        //             break;
        //         }
        //     }
        //     if(flag==0){
        //     System.out.println("Missing number is "+i);
        // }
        // }
        // Time complexity = O(n*w)
        // Space Complexity = O(1)

        // Optimal approach
        int sum1 = (n*(n+1))/2;
        int sum2 = 0;
        for(int i=0; i<arr.length; i++){
            sum2 += arr[i];
        }
        int missing_number = sum1 - sum2;
        System.out.println("Missing number is "+missing_number);
        
    }
    
}
// Time complexity = O(n)
// Space Complexity = O(1)