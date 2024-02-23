package randomCodes;

import java.util.HashSet;

public class random1 {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        if (n == 1) {
            return -1;
        }
        int[][] arr = new int[n][n];
        for (int i = 0; i < flights.length; i++) {
            arr[flights[i][0]][flights[i][1]] = flights[i][2];
        }

        if (arr[src][dst] == 0) {
            arr[src][dst] = Integer.MAX_VALUE;
        }
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(src);
        recursion(src, dst, src, k, arr, 0, set);
        return arr[src][dst] == Integer.MAX_VALUE ? -1 : arr[src][dst];
    }

    public static void recursion(int src, int dst, int row, int k, int[][] arr, int price, HashSet<Integer> set) {

        if (dst == row) {

            if (price < arr[src][dst]) {
                arr[src][dst] = price;
                return;
            } else {
                return;
            }
        }
        if (k < 0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i != row && arr[row][i] > 0 && arr[row][i] != Integer.MAX_VALUE && !set.contains(i)) {
                set.add(i);
                recursion(src, dst, i, k - 1, arr, price + arr[row][i], set);
                set.remove(i);
            }
        }
    }
}
