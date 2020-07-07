package HackerRank;

public class Jump {
    static int jumpingOnClouds(int[] c) {
        int i = 0;
        int result = 0;
        if(i==c.length-2) {
            result++;
        }
        else {
            while (i < c.length - 2) {
                if (c[i + 2] == 0) {
                    i = i + 2;
                    result++;
                } else {
                    i++;
                    result++;
                }
                if (i == c.length - 2) {
                    result++;
                }
            }
        }

            System.out.println(result);

        return result;
    }

    public static void main(String[] args) {
        jumpingOnClouds(new int[] {0,1,0,1,0,0,0,1,0});
    }
}
