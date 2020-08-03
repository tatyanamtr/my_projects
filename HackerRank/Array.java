public class Array {
    public static void initArray(int n) {
        int [][] arr = new int[n][n];
        int i=0;
        int j=0;
        int value = 1;
        while ( n > 0) {
            int k = 0;
            do {
                arr[i] [j++] = value++;
            } while (++k < n-1);
            for (k = 0; k < n-1; k++) {
                arr[i++] [j] = value++;
            }
            for (k = 0; k < n-1; k++) {
                arr[i] [j--] = value++;
            }
            for (k = 0; k < n-1; k++) {
                arr[i--] [j] = value++;
            }
            ++i;
            ++j;
            n=n-2;
        }
        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[a].length; b++) {
                System.out.print(arr[a][b] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        initArray(6);
    }
}
