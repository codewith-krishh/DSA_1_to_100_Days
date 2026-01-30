// Print N to 1 using recursion

import java.util.Scanner;

public class problem_02 {
    
    static void recursionNto1(int n){
        if(n==0) return;
        System.out.print(n + " ");
        recursionNto1(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        recursionNto1(n);
        sc.close();
    }
}
