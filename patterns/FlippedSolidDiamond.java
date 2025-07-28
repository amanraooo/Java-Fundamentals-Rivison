public class FlippedSolidDiamond {
    public static void main(String[] args) {
        int num = 8;
        int n = num / 2;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n - r; c++) {
                System.out.print("* ");
            }
            for (int c = 0; c < 2 * r + 1; c++) {
                System.out.print("  ");
            }
            for (int c = 0; c < n - r; c++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < r + 1; c++) {
                System.out.print("* ");
            }
            for (int c = 0; c < 2 * n - 2 * r - 1; c++) {
                System.out.print("  ");
            }
            for (int c = 0; c < r + 1; c++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}