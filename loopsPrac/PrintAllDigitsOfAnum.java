public class PrintAllDigitsOfAnum {
    public static void main(String[] args) {
        int num = 1234;
        int rem =0;
        while(num>0){
            rem = num% 10;
            System.out.println(rem);
            num = num/10;
        }
    }
}
