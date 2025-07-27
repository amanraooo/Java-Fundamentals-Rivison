public class FullPyramid2 {
    public static void main(String[] args) {

            //     * 
            //    * * 
            //   * * * 
            //  * * * *
            // * * * * * 
        int n = 5;
        for(int r = 0 ; r<n; r++){
            for (int c = 0; c < n-r-1; c++) {
                System.out.print(" ");
            }
            for (int c = 0; c < r+1; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
