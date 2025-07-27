public class InvertedHollowHalfPyramid {
    public static void main(String[] args) {
        // * * * * * 
        // *     *
        // *   *
        // * * 
        // *

        //sol-1
        int n = 5;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n - r; c++) {
                if (r == 0 || r == n - 1 || c == 0 || c == n - r - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //sol-2
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (r == 0 || c == 0 || c == n - r - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
