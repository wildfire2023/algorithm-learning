package leetcode.easy;

import huawei.QuickSort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

    public List<List<Integer>> levelOrder(TreeNode root) {
        // 返回结果
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> help = new LinkedList<>();
        help.offer(root);
        while (!help.isEmpty()) {
            int levelNum = help.size();
            List<Integer> subList = new ArrayList<>();
            for (int i = 0; i < levelNum; i++) {
                TreeNode node = help.poll();
                subList.add(node.val);
                if (node.left != null) {
                    help.offer(node.left);
                }
                if (node.right != null) {
                    help.offer(node.right);
                }
            }
            result.add(subList);
        }
        return result;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
