public class HollowInvertedHalfPyramid {
    public static void main(String[] args) {
            // 12345
            // 2  5
            // 3 5
            // 45
            // 5
        int n =5;
        for (int r = 0; r <= n; r++) {
            for (int c = r+1; c <= n; c++) {
                if(r==0|| c==r+1|| c==n){
                System.out.print(c);
            }
            else{
                System.out.print(" ");
            }
            }
            System.out.println();
        }
    }
}
