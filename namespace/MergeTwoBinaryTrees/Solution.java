package MergeTwoBinaryTrees;

import leetcode.assist.TreeNode;

/**
 * Created by slipkinem on 11/1/2017.
 */

/**
 * Given two binary trees and imagine that when you put one of them to cover the other,
 * some nodes of the two trees are overlapped while the others are not.
 * <p>
 * You need to merge them into a new binary tree. The merge rule is that if two nodes overlap,
 * then sum node values up as the new value of the merged node.
 * Otherwise, the NOT null node will be used as the node of new tree.
 * <p>
 * Example 1:
 * Input:
 * Tree 1                     Tree 2
 * 1                         2
 * / \                       / \
 * 3   2                     1   3
 * /                           \   \
 * 5                             4   7
 * Output:
 * Merged tree:
 * 3
 * / \
 * 4   5
 * / \   \
 * 5   4   7
 * Note: The merging process must start from the root nodes of both trees.
 * 解析：
 * 要merge树的全部节点，那么就从根节点开始，通过递归，将两个树的节点累加起来
 */
public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);

        TreeNode t2 = new TreeNode(3);
        t2.left = new TreeNode(5);
        t2.right = new TreeNode(6);

        Solution solution = new Solution();
        TreeNode t = solution.mergeTrees(treeNode, t2);
        System.out.println(t);
    }
}
