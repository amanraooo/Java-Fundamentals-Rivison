public class Square {
    public static void main(String[] args) {
    // * * * * 
    // * * * * 
    // * * * * 
    // * * * *
    
        int n = 4;

        // outer loop for rows
        for (int i = 1; i <= n; i++) {
            // inner loop to print stars
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
