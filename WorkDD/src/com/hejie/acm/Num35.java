package com.hejie.acm;

/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 */
public class Num35 {
    public static void main(String[] args) {

    }

    public static boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public static boolean isMirror(TreeNode tree1, TreeNode tree2) {
        if ((tree1 == null) && (tree2 == null)) {
            return true;
        }
        if (tree1 == null || tree2 == null) {
            return false;
        }
        return (tree1.val == tree2.val) && isMirror(tree1.left, tree2.right) && isMirror(tree1.right, tree2.left);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
