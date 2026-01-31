package Day1_Basics;

import java.util.Scanner;

public class Part5_time_and_space_complexity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Time Complexity: The rate at which the time, required to run a code, changes with respect to the input size
        int n = 10;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){

                //block of code

            }
        }
        //time complexity = O(n^2)

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){

                //block of code

            }
        }
        //time complexity = O((N^2)/2 + N/2)
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println(c);
        // space complexity = input memory + auxiliary memory(space that we use additionally to solve a problem)
        //space complexity = O(3)
        int[] arr = new int[n];       //Space Complexity = O(n)
        sc.close();

    }
}
