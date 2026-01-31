// Print all divisors of N

package Day12_Functional_vs_Parameterized;
import java.util.Scanner;

public class problem_02 {


    static void divisor(int n, int i){
        if(i > n) return;
        if(n%i==0) System.out.println(i);
        divisor(n, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        divisor(n, 1);
        sc.close();
    }
}

// time complexity = O(n)
// space complexity = O(n) {due to recursive stack}