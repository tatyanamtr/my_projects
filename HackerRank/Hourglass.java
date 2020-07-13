package HackerRank;

import java.util.Arrays;


public class Hourglass {

        static int hourglassSum(int[][] arr) {
            int sum[] = new int[16];
            int count = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    sum[count] = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                            + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1]
                            + arr[i+2][j+2];
                    count++;
                }
            }
            Arrays.sort(sum);
            System.out.println(sum[15]);
            return sum[15];
        }

    public static void main(String[] args) {
        int [][] arr = {{-9, -9, -9, 1, 1, 1},
            {0, -9, 0, 4, 3, 2},
            {-9, -9, -9, 1, 2, 3},
            {0, 0, 8, 6, 6, 0},
            {0, 0, 0, -2, 0, 0},
            {0, 0, 1, 2, 4, 0}};

        hourglassSum(arr);


    }
    }

