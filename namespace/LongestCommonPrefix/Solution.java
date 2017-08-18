package LongestCommonPrefix;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 */

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length <= 0) return "";
        if (strs.length == 1) return strs[0];

        String prefix = "";

        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[0].length(); j++) {
                System.out.println(strs[i].length() == j + 1);
                System.out.println(strs[0].charAt(j) != strs[i].charAt(j));
                if (strs[i].length() == j + 1 || strs[0].charAt(j) != strs[i].charAt(j)) {
                    prefix = strs[0].substring(0, j + 1);
                    break;
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"cfdf", "cfre"};

        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(strs));
        ;
    }

}
