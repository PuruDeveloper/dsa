//Given string is palindrome or not

import java.util.Scanner;

public class recursion7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s="";
        s = sc.next();
        f(0, s.length()-1, s);
    }

    public static void f(int l, int r, String s) {
        if(l>=r) {
            System.out.println("True");
            return;
        }
        if(s.charAt(l)!=s.charAt(r)) {
            System.out.println("False");
            return;
        }
        f(l+1, r-1, s);
    }
}
