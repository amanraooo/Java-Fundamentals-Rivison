public class NumericHollowHalfPyramid {
    public static void main(String[] args) {
            // 1
            // 12
            // 1 3
            // 1  4
            // 1   5
            // 123456
        int n = 6;
        for(int row = 0 ; row<n ; row++){
            for(int col = 0 ; col < row+1 ; col++){
                if(col==0|| col==row || row==n-1){
                System.out.print(col+1);
                }     
                else{
                    System.out.print(" ");
                } 
            }
            System.out.println();
            
        }
    }
}
