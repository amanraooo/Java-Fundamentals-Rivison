public class RevrseInteger {
    public static void main(String[] args) {
        int digit = -1234, ans = 0, rem = 0;
        boolean isNeg = false;
        if (digit < 0) {
            isNeg = true;
            digit = -digit;
        }
        while (digit > 0) {
            rem = digit % 10;
            ans = ans * 10 + rem;
            digit = digit / 10;
        }
        if (isNeg) {
            System.out.println(-ans);

        } else {
            System.out.println(ans);

        }

    }
}