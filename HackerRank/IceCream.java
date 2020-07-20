import java.util.HashMap;
import java.util.Map;

public class IceCream {
    static void whatFlavors(int[] cost, int money) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < cost.length; i++) {

            int c = money - cost[i];
            if (map.containsKey(c) && map.get(c) != i) {
                System.out.println((map.get(c)+1) + " " + (i+1));
            }

            map.put(cost[i], i);
        }

    }

    public static void main(String[] args) {
        int [] arr = {1, 4, 5, 3, 2};
        whatFlavors(arr, 4);
    }
}
