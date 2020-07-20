import java.util.Set;

public class HashSet {
    static int pairs(int k, int[] arr) {
        Set <Integer> hs = new HashSet <>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
            if (hs.contains(arr[i]-k)) {
                count++;
            }
            if (hs.contains(arr[i]+k)) {
                count++;

            }


        }
        return count;


    }
}
