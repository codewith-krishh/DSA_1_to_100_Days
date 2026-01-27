// Check prime

package DAY8_Basic_Math;
import java.util.Scanner;

public class problem_01 {

    static boolean checkPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    static boolean checkPrimeOptimized(int n){
        if (n <= 1) return false;
        for(int i=2; i*i<=n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        // Brute force approach
        // time complexity = O(n)
        // space complexity = O(1)
        if(n==1 || n==0){
            System.out.println("Given number is neither prime not composite");
        }
        else if(n==2){
            System.out.println("Yes, it's a prime number");
        }
        else if(checkPrime(n)){
            System.out.println("Yes, it's a prime number");
        }
        else{
            System.out.println("No, it's not a prime number");
        }


        // Optimal approach
        // time complexity = O(√n)
        // space complexity = O(1)
        boolean check = checkPrimeOptimized(n);
        if(check){
            System.out.println("Yes, it's a prime number");
        }
        else{
            System.out.println("No, it's not a prime number");
        }

        sc.close();
    }


}
