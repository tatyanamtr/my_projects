package HackerRank;

public class Valleys {
    static int countingValleys(int n, String s) {
        int v = 0;
        int result = 0;
        for (int i =0; i < n-1;i++) {
            if  (s.charAt(i) == 'U') {
                v++;
            } else {
                v--;
                if( v==-1) {
                    result++;
                }
                else continue;
            }
        }
        return result;

    }

    public static void main(String[] args) {

        System.out.println(countingValleys(12, "DDUUDDUDUUUD"));
    }
}
