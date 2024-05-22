//Sum of first n numbers
import java.util.Scanner;

public class recursion5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 0, sum=0;
        n = sc.nextInt();
        f(sum, n);
    }

    public static void f(int sum, int n) {
        if(n<1) {
            System.out.println(sum);
            return;
        }
        f(sum+n, n-1);
    }
}
