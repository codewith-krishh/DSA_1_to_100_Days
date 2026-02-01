// Print array elements recursively

package Day13_Recursion_on_Arrays;
import java.util.Scanner;

public class problem_01 {

    static void input_array(int[] arr, Scanner sc){
        System.out.println("Enter the elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }


    static void printArrayRecursion(int[] arr, int n){
        if(n<0) return;
        printArrayRecursion(arr, n-1);
        System.out.print(arr[n] + " ");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input_array(arr, sc);
        printArrayRecursion(arr, arr.length - 1);
        sc.close();
    }
}
