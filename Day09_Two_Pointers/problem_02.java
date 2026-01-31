// Pair with given sum
package Day9_Two_Pointers;
import java.util.HashMap;
import java.util.Scanner;

public class problem_02 {

    static void inputArray(int[] arr, Scanner sc){
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }


    static boolean pairSum1(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }


    static boolean pairSum2(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(target - arr[i])){
                return true;
            }
            map.put(arr[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the target: ");
        int x = sc.nextInt();
        int[] arr = new int[n];
        inputArray(arr, sc);


        // brute approach 
        // time complexity = O(n^2)
        // space complexity = O(1)
        boolean sumExist1 = pairSum1(arr, x);
        if(sumExist1){
            System.out.println("Pair sum exists");
        }
        else{
            System.out.println("Pair sum not exists");
        }


        // better approach/ best approach approach if array is not sorted
        // time complexity = O(n)
        // space complexity = O(n)
        boolean sumExist2 = pairSum2(arr, x);
        if(sumExist2){
            System.out.println("Pair sum exists");
        }
        else{
            System.out.println("Pair sum not exists");
        } 
        sc.close();       
    }
}
