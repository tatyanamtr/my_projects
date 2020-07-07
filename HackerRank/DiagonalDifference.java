package HackerRank;

import java.util.List;


public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int a = 0;
        int b = 0;
        int result;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if(j==i){
                    a += arr.get(i).get(j);
                }

            }
            for (int k = 0; k < arr.size(); k++) {
                if(i+k == (arr.size()-1)){
                    b+= arr.get(i).get(k);
                }

            }
        }
        result = a - b;
        if (result < 0){
            return -result;
        } else return result;

    }

}

