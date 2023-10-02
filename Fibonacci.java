import java.util.ArrayList;
import java.util.Arrays;  


public class Fibonacci {

int uno;
int dos;

    public static ArrayList<Integer> forFibonacciMethod (int one, int two) {
        int discard;
        ArrayList<Integer> forFibonacci = new ArrayList<Integer>();

        forFibonacci.add(one);
        forFibonacci.add(two);

        for (int i = 0; i < 18; i++) {
            forFibonacci.add(one + two);
            discard = one;
            one = two;
            two = two += discard;
        }

        return forFibonacci;
    }

    public static ArrayList<Integer> whileFibonacciMethod (int one, int two) {
        int discard;
        ArrayList<Integer> whileFibonacci = new ArrayList<Integer>();

        whileFibonacci.add(one);
        whileFibonacci.add(two);
        
        int i = 0;

        while (i < 18) {
            whileFibonacci.add(one + two);
            discard = one;
            one = two;
            two = two += discard;

            i+=1;
        }

        return whileFibonacci;
    }

    public static ArrayList<Integer> doWhileFibonacciMethod (int one, int two) {
        int discard;
        ArrayList<Integer> doWhileFibonacci = new ArrayList<Integer>();

        doWhileFibonacci.add(one);
        doWhileFibonacci.add(two);
        
        int j = 0;

        do {
            doWhileFibonacci.add(one + two);
            discard = one;
            one = two;
            two = two += discard;

            j+=1;
        } while (j < 18);

        return doWhileFibonacci;
    }

    public static void main(String[] args) {

        
        System.out.println(forFibonacciMethod(0,1));
        System.out.println(whileFibonacciMethod(0,1));
        System.out.println(doWhileFibonacciMethod(0,1));
    }
}
