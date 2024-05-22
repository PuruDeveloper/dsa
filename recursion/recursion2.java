//Print Name N times using recursion

import java.util.Scanner;

public class recursion2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f(1,n);
    }

    public static void f(int i, int n) {
        if(i>n) {
            return;
        }
        System.err.println("Purushottam");
        f(i+1, n);
    }

}
