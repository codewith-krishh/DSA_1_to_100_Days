// Sum of first N natural numbers
import java.util.Scanner;

public class problem_03 {


    static int sumOfNaturalNum(int n){
        if(n==1) return 1;
        return n + sumOfNaturalNum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = sumOfNaturalNum(n);
        System.out.println("The sum of first N natural numbers: " +sum);
        sc.close();
    }
    
}
