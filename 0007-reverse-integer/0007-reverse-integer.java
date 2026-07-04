class Solution {
    public int reverse(int x) {

        int num = Math.abs(x);
        int rev = 0;

        while(num > 0) {
            int lastDigit = num % 10;

            if (rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && num > 8)) {
                return 0;
            }

            rev = (rev * 10) + lastDigit;
            num = num / 10;
        } 
        return (x < 0) ? (-rev) : rev;
    }
}