public class Namaste {
    public static void main(String[] args) {
         int n = 5;
        for(int r = 0 ; r<n ; r++){
            for(int sp = 0; sp< n-r ; sp++){
                System.out.print("  ");
            }
            for(int st = 0 ; st<  2*r+1 ; st++){
                if(st==0 || st==2*r){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        } 
    }
}
