package Average_of_Levels_in_Binary_Tree_637;


import java.util.*;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution {

    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<Double> nodes = new ArrayList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            double sum = 0;
            int n = queue.size();

            for(int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }

            nodes.add(sum / n);

        }
        return nodes;
    }

}