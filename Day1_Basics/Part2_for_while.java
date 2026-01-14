package Day1_Basics;

public class Part2_for_while {
    public static void main(String[] args){
        System.out.println("Print 0-9 using for loop");
        for(int i = 0; i<10; i++){               //for loop
            System.out.println(i);
        } 
        System.out.println();
        System.out.println("Print 0-9 using while loop");
        int k = 0;
        while(k<10){                             //while loop
            System.out.println(k);
            k++;
        }
    }
}
