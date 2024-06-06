package sail_phase2;

import java.util.List;

public class AllPossibleFullBinaryTrees {
    // https://leetcode.com/problems/all-possible-full-binary-trees/description/
    /*
    주어진 정수 n에 대하여 n개의 노드로 구성된 가능한 모든 완전 이진 트리의 목록을 반환합니다.
    답안의 각 트리에서 모든 노드는 Node.val == 0이어야 합니다.
    답변의 각 요소는 하나의 가능한 트리의 루트 노드입니다. 최종 트리 목록은 어떤 순서로 반환해도 괜찮습니다.
    완전 이진 트리는 각 노드가 정확히 0개 또는 2개의 자식을 가지는 이진 트리입니다.
     */
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<TreeNode> allPossibleFBT(int n) {

        return null;
    }

    public static void main(String[] args) {

    }
}
