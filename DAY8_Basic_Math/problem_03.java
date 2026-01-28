// GCD of two numbers

package Day8_Basic_Math;
import java.util.Scanner;

public class problem_03 {

    static int gcdOfNumbers1(int n, int m){
        int gcd = 1;
        for(int i=1; i<=Math.min(n,m); i++){
            if(n%i==0 && m%i==0){
                gcd = i;
            }
        }
        return gcd;
    }

    static int gcdOfNumbers2(int n, int m){
        for(int i=Math.min(n,m); i>0; i--){
            if(n%i==0 && m%i==0){
                return i;
            }
        }
        return 1;
    }

    static int euclideanAlgorithm(int n, int m){
        n = Math.abs(n);
        m = Math.abs(m);

        if(n == 0) return m;
        if(m == 0) return n;

        while(n>0 && m>0){
            if(n>m){
                n %= m;
            }
            else{
                m %= n;
            }
        }
        if(n == 0) {
            return m;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int n = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int m = sc.nextInt();

        // Brute force Approach
        // time complexity = O(min(n, m))
        // space complexity = O(1)
        int gcd1 = gcdOfNumbers1(n, m);
        System.out.println("The GCD of the given numbers is: " +gcd1);

        // Better Approach
        // time complexity = O(min(n, m))
        // space complexity = O(1)
        int gcd2 = gcdOfNumbers2(n, m);
        System.out.println("The GCD of the given numbers is: " +gcd2);

        // Optimal approach(Euclidean Algorithm)
        // time complexity = O(log(min(n, m)))
        // space complexity = O(1)
        int gcd3 = euclideanAlgorithm(n, m);
        System.out.println("The GCD of the given numbers is: " +gcd3);
        sc.close();
    }
}
