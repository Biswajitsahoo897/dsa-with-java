package tree;

public class PathSumEqualsToK {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null)
            return root.val == targetSum;
        int remaining = targetSum - root.val;
        return hasPathSum(root.left, remaining) || hasPathSum(root.right, remaining);
    }

    public static void main(String[] args) {
        /* * sample binary tree:
         * * 5
         * / \
         * 4   8
         * /   /
         * 11  13
         * /  \
         * 7    2
         */
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        int target1 = 22;
        
        System.out.println("Does a path sum to " + target1 + "? " + hasPathSum(root, target1)); 
        // Should print true

        int target3 = 90;
        System.out.println("Does a path sum to " + target3 + "? " + hasPathSum(root, target3)); 
        // Should print false
    }
}