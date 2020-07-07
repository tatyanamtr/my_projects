package HackerRank;

import java.util.Arrays;

public class Socks {
    static int sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);
        int count = 1;
        int pairs = 0;
        int z = ar[0];
        for ( int i = 1; i < n; i++) {
            if (ar[i] == z) {
                count++;
                if (count%2 == 0) {
                    pairs++;
                    //count = 0;
                }
                else continue;
            }
            else {
                z = ar[i];
                count = 1;
            }

        }
        System.out.println(pairs);
        return pairs;

    }

    public static void main(String[] args) {
        Socks.sockMerchant(15, new int []{6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3 ,5});
    }

}
