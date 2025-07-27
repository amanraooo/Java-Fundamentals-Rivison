public class InvertedHalfPyramidMirror {
    public static void main(String[] args) {

        // * * * * * 
        //   * * * *
        //     * * *
        //       * *
        //         *
        int n = 5;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (c < r) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
