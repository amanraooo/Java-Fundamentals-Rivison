public class NumericPalindromicPyramid {
    public static void main(String[] args) {
        //           1 
        //         1 2 1
        //       1 2 3 2 1
        //     1 2 3 4 3 2 1 
        //   1 2 3 4 5 4 3 2 1
        int n = 5;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n - r; c++) {
                System.out.print("  ");
            }
            for (int c = 0; c < r + 1; c++) {
                System.out.print(c + 1 + " ");
            }
            for (int c = r; c >= 1; c--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
