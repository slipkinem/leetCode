package RomanToInteger;

/**
 * Given a roman numeral, convert it to an integer.
 * <p>
 * Input is guaranteed to be within the range from 1 to 3999.
 * I（1）、V（5）、X（10）、L（50）、C（100）、D（500）和M（1000）
 * 罗马数字右加左减 如 4 => IV (V-I 5 - 1) VI => 6 (V + I)
 *  遍历所有字符
 *    设 current = 当前字符，prev = 之前字符，temp = 之前所有字符之和,r = 结果
 *      current == prev temp += current
 *      current > prev temp = current - temp
 *      current < prev r += temp 拿到之前累计的结果，然后将temp = current，表示一个轮回完成，从小到大是一个轮回
 */
public class Solution {
    private int romanValue(char i) {
        int r = 0;
        switch (i) {
            case 'I':
                r = 1;
                break;
            case 'V':
                r = 5;
                break;
            case 'X':
                r = 10;
                break;
            case 'L':
                r = 50;
                break;
            case 'C':
                r = 100;
                break;
            case 'D':
                r = 500;
                break;
            case 'M':
                r = 1000;
                break;
        }
        return r;
    }

    public int romanToInt(String s) {
        if (s.trim().length() <= 0) return 0;
        int sum = 0; // 结果
        int current; // 当前位
        int prev = romanValue(s.charAt(0)); // 之前位
        int temp = prev; //

        for (int i = 1; i < s.length(); i++) {
            // 现在
            current = romanValue(s.charAt(i));
            //
            if (current == prev) {
                temp += current;
            } else if (current > prev) {
                temp = current - temp;
            } else if (current < prev) {
                // 一个轮回，temp为一个轮回的和，不谈碰见current > prev的情况就会有问题
                sum += temp;
                temp = current;
            }
            prev = current;
        }
        sum += temp;

        return sum;
    }

    public static void main(String[] args) {
        // todo: romanToInt("VII") => 7 romanToInt("IV") => 4
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("MCMXCVI"));
    }
}