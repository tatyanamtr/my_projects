
package HackerRank;

import java.util.Objects;

public class Binary {
        public static int binaryNumber(int n) {
            String [] s = Integer.toBinaryString(n).split("");
            int count = 0;
            int max = 1;
            for (int i =0; i < s.length; i++) {
                if (Objects.equals(s[i], "1")) {
                    count++;
                    if (count > max) {
                        max = count;
                    }
                } else {
                    count = 0;
                }
            }
            System.out.println(max);
            return max;
        }


}
