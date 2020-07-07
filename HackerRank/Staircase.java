package HackerRank;

public class Staircase {

        // Complete the staircase function below.
        static void staircase(int n) {
            String s = "#";
            StringBuilder sb = new StringBuilder("");
            for (int j = 0; j < n; j++) {
                sb = sb.append(" ");
            }
            for (int i = 1; i<=n; i++) {
                sb = sb.deleteCharAt(n-i).append(s);
                System.out.println(sb);
            }

        }



        public static void main(String[] args) {

            staircase(6);

        }
    }


