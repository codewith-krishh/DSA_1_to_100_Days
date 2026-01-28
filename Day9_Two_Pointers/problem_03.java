// Remove duplicates (two pointers)

package Day9_Two_Pointers;
import java.util.Scanner;

public class problem_03 {

    static void inputArray(int[] arr, Scanner sc){
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }


    static int removeDuplicates(int[] arr){
        int i = 0;
        for(int j=1; j<arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }


    static void printArray(int[] arr, int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        inputArray(arr, sc);

        // time complexity = O(n)
        // space complexity = O(1)
        int newSize = removeDuplicates(arr);
        System.out.println("Updated array after removing duplicates: ");
        printArray(arr, newSize);
    }
}
