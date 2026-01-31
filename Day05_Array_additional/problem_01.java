// Majority element (> n/2)
package Day5_Array_additional;

import java.util.*;

public class problem_01 {

    static void input_array(int[] arr, Scanner sc){
        System.out.println("Enter the elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    static int majority_element1(int[] arr){
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
                if(count > (arr.length/2)){
                    return arr[j];
                }
            }
        }
        //In case there is no majority element
        return -1;
    }


    static int majority_element2(int[] arr){
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > n/2){
                return entry.getKey();
            }
        }
        // Return -1 if no majority element is found
        return -1;
    }


    static int majority_element3(int[] arr){
        int n = arr.length;
        int count = 0;
        int element = 0;
        for(int i=0; i<n; i++){
            if(count == 0){
                count = 1;
                element = arr[i];
            }
            else if(element == arr[i]){
                count ++;
            }
            else{
                count --;
            }
        }
        // Return -1 if no majority element is found
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input_array(arr, sc);

        //brute-force approach
        // time complexity = O(n^2)
        // space complexity = O(1)
        int majority_el1 = majority_element1(arr);
        System.out.println("The majority element of this array is: " +majority_el1);


        // Better approach
        // time complexity = O(n)
        // space complexity = O(n)
        int majority_el2 = majority_element2(arr);
        System.out.println("The majority element of this array is: " +majority_el2);


        // Optimal approach
        // time complexity = O(n)
        // space complexity = O(1)
        int majority_el3 = majority_element3(arr);
        System.out.println("The majority element of this array is: " +majority_el3);
    }
}
