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
 *  Tree 1                     Tree 2
 *     1                         2
 *    / \                       / \
 *   3   2                     1   3
 *  /                           \   \
 * 5                             4   7
 * Output:
 * Merged tree:
 *     3
 *    / \
 *   4   5
 *  / \   \
 * 5   4   7
 * Note: The merging process must start from the root nodes of both trees.
 */
public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode r = new TreeNode(0);

        return r;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);

        TreeNode t2 = new TreeNode(3);
        t2.left = new TreeNode(5);
        t2.right = new TreeNode(6);

        Solution solution  = new Solution();
        System.out.println(solution.mergeTrees(treeNode, t2));
    }
}
