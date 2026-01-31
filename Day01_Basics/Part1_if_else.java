package Day01_Basics;

import java.util.Scanner;

public class Part1_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();                           //Taking input from the user
        if(n<10){                                       //condtion 01
            System.out.println("Number is smaller than 10");
        }
        else if(n==10){                                 //condition  02
            System.out.println("Number is equal to 10");
        }
        else{                                           //if both conditions fail t
            System.out.println("Number is greater than 10");
        }
        sc.close();
    }
}
