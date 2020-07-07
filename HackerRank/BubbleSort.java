package HackerRank;

public class BubbleSort {
    static void countSwaps(int[] a) {
        int count =0;

        for (int i : a) {
            for( int j =0; j < a.length-1; j++) {
                if (a[j] > a[j+1]) {
                    int swap = a[j];
                    a[j] = a[j+1];
                    a[j+1] = swap;
                    count++;
                }
                else continue;
            }
        }
        System.out.println("Array is sorted in " + count + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length-1]);
    }

    public static void main(String[] args) {
        BubbleSort.countSwaps(new int[]{5,3,7,1,8});
    }
}
