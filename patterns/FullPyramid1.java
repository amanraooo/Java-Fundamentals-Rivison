public class FullPyramid1 {
    public static void main(String[] args) {
        //         * 
        //       * * * 
        //     * * * * * 
        //   * * * * * * * 
        int n = 4;
        for (int r = 0; r < n; r++) {
            for (int sp = 0; sp < n - r; sp++) {
                System.out.print("  ");
            }
            for (int st = 0; st < (2 * r + 1); st++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
