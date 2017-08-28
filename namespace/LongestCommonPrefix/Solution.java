package LongestCommonPrefix;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 */

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length <= 0) return "";

        String prefix = strs[0];

//        for (int i = 1; i < strs.length; i++) {
//            for (int j = 0; j < strs[0].length(); j++) {
//                // strs[i].length() == j 防止字符串索引越界
//                System.out.println(strs[i].length() == j);
//                if (strs[i].length() == j || strs[0].charAt(j) != strs[i].charAt(j)) {
//                    prefix = strs[0].substring(0, j);
//                    return prefix;
//                }
//            }
//        }
        // 先循环字符，可以防止空字符串现象
        for (int i = 0; i < strs[0].length(); i++) {
            char p = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                // strs[i].length() == i 防止字符串索引越界
                if (strs[j].length() == i || p != strs[j].charAt(i)) {
                    prefix = strs[0].substring(0, i);
                    return prefix;
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"abab", "aba", ""};

        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(strs));
    }

}
