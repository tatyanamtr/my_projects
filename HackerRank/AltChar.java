package HackerRank;
//For each query, print the minimum number of deletions required on a new line.
public class AltChar {
    static int alternatingCharacters(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char z = s.charAt(i);
            if (s.charAt(i + 1) == z) {
                count++;
            } else continue;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(alternatingCharacters("HNHHNHHHHNH"));
    }
}
