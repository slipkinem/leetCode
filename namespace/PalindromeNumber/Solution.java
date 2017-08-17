package PalindromeNumber;

/**
 * 回文数字：121 左右数字一样
 * 只需判断他revers以后的数字和原数字是否相同
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class Solution {
    //    public boolean isPalindrome(int x) {
//        int old = x;
//        int r = 0;
//        while (x != 0) {
//            r = r * 10 + x % 10;
//            x /= 10;
//        }
//
//        return r == old;
//    }
    public boolean isPalindrome(int x) {
        int old = x;
        int r = 0;
        if (x < 0) {
            return false;
        }

        while (x != 0) {
            r = r * 10 + x % 10;
            x /= 10;
        }
        return r == old;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // test solution.isPalindrome(123321)
        // 期待输出 true
        System.out.println(solution.isPalindrome(1));
    }
}