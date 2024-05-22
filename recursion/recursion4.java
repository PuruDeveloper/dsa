//Print from n to 1
import java.util.Scanner;

public class recursion4 {
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
        System.out.println(n);
        f(n-1);
    }
}
