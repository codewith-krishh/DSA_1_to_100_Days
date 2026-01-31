// Fibonacci number (nth term)

package Day12_Functional_vs_Parameterized;
import java.util.Scanner;

public class problem_01 {

    static int fib(int n){
        if(n==0 || n==1) return n;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int fibonacci = fib(n);
        System.out.println("Number "+n+ " in fibonacci series is: " +fibonacci);

        sc.close();
    }
}

// time complexity = O(n)
// space complexity = O(n) {due to recursive stack}