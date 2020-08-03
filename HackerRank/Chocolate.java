public class Chocolate {

    static int birthday(List<Integer> s, int d, int m) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < m; i++) {
            sum += s.get(i);
        }
        for (int i = 0; i < s.size() - m + 1; i++) {
            if (sum == d) {
                count++;
            }
            if (i + m < s.size()) {
                sum = sum - s.get(i) + s.get(i + m);
            }
        }
        return count;

    }
}