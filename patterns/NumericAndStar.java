public class NumericAndStar {
    public static void main(String[] args) {
            // 1
            // 2 * 2
            // 3 * 3 * 3
            // 4 * 4 * 4 * 4
        int n = 4;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < 2 * r + 1; c++) {
                if (c % 2 == 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print( r + 1);
                }
            }

            System.out.println();
        }
    }
}
