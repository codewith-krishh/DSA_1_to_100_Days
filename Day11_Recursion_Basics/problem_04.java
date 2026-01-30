// Factorial of N
import java.util.Scanner;

public class problem_04 {

    static int factorialOfN(int n){
        if(n==1 || n==0) return 1;
        return n * factorialOfN(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int factorial = factorialOfN(n);
        System.out.println("Factorial of " +n+ " is: " +factorial);
        sc.close();
    }
}
