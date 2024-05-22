//Reverse an array

import java.util.Scanner;

public class recursion6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int l=0;
        f(l, n-1, arr);
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void f(int l, int r, int[] arr) {
        if(l>=r) {
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        f(l+1, r-1, arr);
    }
}
