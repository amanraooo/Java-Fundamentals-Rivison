public class HollowRectangle {
    public static void main(String[] args) {

    // * * * * * 
    // *       *
    // *       *
    // *       *
    // * * * * *

        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (row == 0 || row == 4) {
                    System.out.print("* ");
                } else {
                    if (col == 0 || col == 4) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
                System.out.println();

        }
    }
}
