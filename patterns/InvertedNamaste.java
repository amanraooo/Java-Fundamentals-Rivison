public class InvertedNamaste {
    public static void main(String[] args) {

                // *     * 
                //  *   *
                //   * *
                //    *
        int n = 4;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < r; c++) {
                System.out.print(" ");
            }
            for (int c = 0; c < n - r; c++) {
                if (c == 0 || c == n - r - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
