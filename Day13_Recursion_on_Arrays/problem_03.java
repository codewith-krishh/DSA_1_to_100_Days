// Linear search using recursion

package Day13_Recursion_on_Arrays;

import java.util.Scanner;

public class problem_03 {


    static void input_array(int[] arr, Scanner sc){
        System.out.println("Enter the elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    static boolean linearSearchRecursion(int[] arr, int index, int target){
        if(index<0) return false;
        if(arr[index] == target) return true;
        return linearSearchRecursion(arr, index-1, target);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.print("Enter the target element: ");
        int x = sc.nextInt();
        int[] arr = new int[n];
        input_array(arr, sc);
        boolean check = linearSearchRecursion(arr, n-1, x);

        if(check) System.out.println("Element found !");
        else System.out.println("Not found !");
        sc.close();
    }
}
