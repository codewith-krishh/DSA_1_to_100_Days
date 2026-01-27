// LCM of two numbers

package DAY8_Basic_Math;

import java.util.Scanner;

public class problem_04 {


    static int lcm1(int a, int b) {
    if (a == 0 || b == 0) return 0;
    int max = Math.max(a, b);
    for (int i = max; i <= a * b; i += max) {
        if (i % a == 0 && i % b == 0) {
            return i;
        }
        }
    return -1;
    }

    static int gcd(int n, int m){
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

    static int lcm2(int a, int b) {
    if (a == 0 || b == 0) return 0;
    return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // brute force approach
        // time complexity = O(max(a, b))
        // space complexity = O(1)
        System.out.println("LCM = " + lcm1(a, b));

        // optimal approach
        // time complexity = O(log(min(n, m)))
        // space complexity = O(1)
        System.out.println("LCM = " + lcm2(a, b));
        sc.close();
    }
}
