package ReverseInteger;

/**
 * Reverse digits of an integer.
 * <p>
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * <p>
 * click to show spoilers.
 * <p>
 * Note:
 * The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
 */

public class Solution {
    public int reverse(int num) {
        int result = 0;
        while (num != 0) {
            if (result != 0 && Integer.MAX_VALUE / Math.abs(result) < 10) {
                return 0;
            }

            result = result * 10 + num % 10;
            num /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(-123));
    }
}
