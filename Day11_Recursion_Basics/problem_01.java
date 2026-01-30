// Print 1 to N using recursion

import java.util.Scanner;

public class problem_01 {


    static void recursion1toN(int n){
        if(n==0) return;
        recursion1toN(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        recursion1toN(n);
        sc.close();
    }
}
