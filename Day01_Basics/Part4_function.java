package Day1_Basics;

// import java.util.Scanner;
class Wrapper{
    int value = 10;
}
public class Part4_function {

    static void modify(Wrapper j){
        j.value += 25;
    }

    static void test(int a){
        a = a+10;
        System.out.println(a);
    }
    public static void main(String[] args) {
        int n = 10;
        test(n);                    //pass by Value
        System.out.println(n);
        // No true pass-by-reference, but objects’ internal data can change.
        Wrapper j = new Wrapper();
        modify(j);
        System.out.println(j.value);
    }
}
