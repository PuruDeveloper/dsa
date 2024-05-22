//Print from 1 to n

import java.util.Scanner;

public class recursion3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        n = sc.nextInt();
        f(n);
    }

    public static void f(int n) {
        if(n==0) {
            return;
        }
        f(n-1);
        System.out.println(n);
    }
}
