
//Print n times with recursion
import java.util.*;

public class recursion1 {
    public static void func(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        func(--n);
    }chal

    public static void main(String ars[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(n);
    }
}