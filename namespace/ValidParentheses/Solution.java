package ValidParentheses;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * 解决问题
 *  1. 首先应该遍历字符串的每个字符
 *  2. 判断括号是否关闭，那么首先不会出现 '}])'
 *  3. 如果第一次出现 '('，那么可以认定下一个字符如果不是 '{[' 应该是 ')' 才会闭合
 *  4. 那么如果出现prefix符号，那就将它对应的suffix存进容器
 *  5. 如果没有了prefix，那就假定他是suffix，然后判断这个suffix是不是和容器最后一个符号相等，相等的那么这个符号就是闭合的
 *  6. 继续循环，判断，直到结束
 */
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> cs = new Stack<>();

        for (char c :
                s.toCharArray()) {
            if (c == '(') {
                cs.push(')');
            } else if (c == '[') {
                cs.push(']');
            } else if (c == '{') {
                cs.push('}');
            } else if (cs.isEmpty() || cs.pop() != c) {
                return false;
            }
        }
        // 如果是'{}{' 这种情况
        // 那么循环完毕cs里面还有'}'
        // 如果是 '{}{}'这种情况
        // 那么循环完毕cs里面是空的
        // 所以，循环完毕，空的是true
        return cs.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid(""));
    }
}
