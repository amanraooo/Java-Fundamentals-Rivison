public class NumericHalfPyramid {
    public static void main(String[] args) {
    // 1 
    // 1 2 
    // 1 2 3 
    // 1 2 3 4
    // 1 2 3 4 5 
    
        int n = 5;
        for(int row = 0 ; row<n ; row++){
            for(int num = 0 ; num < row+1 ; num++){
                System.out.print(num+1+ " ");
            }
            System.out.println();
        }
    }
}
