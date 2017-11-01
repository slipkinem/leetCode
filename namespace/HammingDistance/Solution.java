package HammingDistance;

/**
 * Created by slipkinem on 11/1/2017.
 */

/**
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * <p>
 * Given two integers x and y, calculate the Hamming distance.
 * <p>
 * Note:
 * 0 ≤ x, y < 231.
 * Example:
 * <p>
 * Input: x = 1, y = 4
 * <p>
 * Output: 2
 * <p>
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * ↑   ↑
 * <p>
 * The above arrows point to positions where the corresponding bits are different.
 * ## 解释：
 * 两个字符串对应位置不同字符的个数
 * 1001110
 * 0111010
 * Hamming distance 4
 * ## 解答
 * 十进制转换二进制就是除以2，取余数，第一位余数正好是二进制的最后一位。所以只需要对比每一位的数字是否相等。
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        int r = 0;
        while (x != 0 || y != 0) {
            if (x % 2 != y % 2) {
                r++;
            }
            x /= 2;
            y /= 2;
        }
        return r;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hammingDistance(1, 4));
        System.out.println(solution.hammingDistance(4, 5));
        System.out.println(1 ^ 4);
        System.out.println(4 ^ 1);
    }
}
