public class HollowRectangle {
    public static void main(String[] args) {

        // * * * * * 
        // *       * 
        // *       * 
        // *       * 
        // * * * * * 
        
        int n = 5;

        //sol-1
        // for (int row = 0; row < 5; row++) {
        // for (int col = 0; col < 5; col++) {
        // if (row == 0 || row == 4) {
        // System.out.print("* ");
        // } else {
        // if (col == 0 || col == 4) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // }
        // System.out.println();

        // }

        //sol-2
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
