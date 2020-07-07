package HackerRank;

public class RotLeft {

        // Complete the rotLeft function below.
        static int[] rotLeft(int[] a, int d) {
            for (int count =0; count < d; count++) {
                int z = a[0];
                for (int i=0; i <= a.length-2; i++) {
                    a[i] = a[i+1];
                }
                a[a.length-1] =z;
            }
            for (int value : a) {
                System.out.println(value);
            }

            return a;
        }
        public static void main(String[] args) {

        RotLeft.rotLeft(new int[]{1, 2, 3, 4, 5}, 4);
    }
}



