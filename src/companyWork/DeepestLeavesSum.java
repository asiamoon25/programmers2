package companyWork;

import javax.swing.tree.TreeNode;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeavesSum {

    public static class TreeNode {
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

    /*
    하나씩 들어온다는 건가? 그런거 같음
     */
    int sum = 0;
    int maxDepth = 0;

    public void dfs(TreeNode root, int depth) {
        if(depth > maxDepth) {
            sum = 0;
            maxDepth = depth;
        }

        if(depth == maxDepth){
            sum += root.val;
        }

        if(root.right != null){
            dfs(root.right, depth + 1);
        }

        if(root.left != null){
            dfs(root.left, depth+1);
        }
    }
    public  int deepestLeavesSum(TreeNode root){

        int depth = 0;

        if(root != null){
            dfs(root, depth);
        }



        return sum;
    }

    public static void main(String[] args) {


    }
}
