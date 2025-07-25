public class NumericHalfPyramid {
    public static void main(String[] args) {
    // 1 
    // 1 2 
    // 1 2 3 
    // 1 2 3 4
    // 1 2 3 4 5 
    
        int n = 5;
        for(int row = 1 ; row<=n ; row++){
            for(int num = 1 ; num <= row ; num++){
                System.out.print(num+ " ");
            }
            System.out.println();
        }
    }
}
