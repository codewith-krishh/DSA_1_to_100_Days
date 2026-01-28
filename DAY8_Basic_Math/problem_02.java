// Print primes up to N

package Day8_Basic_Math;

import java.util.Scanner;

public class problem_02 {

    static boolean checkPrime(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }


 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number upto which you want to check prime number: ");
    int n = sc.nextInt();
    System.out.println("Prime numbers:");

    // Brute force approach
    // time complexity = O(n√n)
    // space complexity = O(1)
    for(int i = 2; i <= n; i++){
        if(checkPrime(i)){
            System.out.println(i);
        }
    }

    // Optimal Approach(Sieve of Eratosthenes)
    // time complexity = O(n log(log n))
    // space complexity = O(n)
    boolean[] isPrime = new boolean[n + 1];

    for(int i=2; i<=n; i++){
        isPrime[i] = true;
    }

    for(int i=2; i*i<=n; i++){
        if(isPrime[i]){
            for(int j=i*i; j<=n; j+=i){
                isPrime[j] = false;
            }
        }
    }

    for(int i=2; i<=n; i++){
        if(isPrime[i]){
            System.out.println(i);
        }
    }
    
    sc.close();
 }   
}