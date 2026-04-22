package tree;

public class BuildBinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.left=this.right=null;
            this.data=data;
        }
    }
    static int idx=-1;
    static Node buildTree(int []nodes){
        idx++;
        if(nodes[idx]==-1) return null;

        Node newNode=new Node(nodes[idx]);
        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);

        return newNode;
    }

    static void inorderTraversal(Node root){
        if(root==null) return;

        inorderTraversal(root.left);
        System.out.print(root.data+" ");
        inorderTraversal(root.right);
    }

    static void preorderTraversal(Node root){
        if(root==null) return;
        
        System.out.print(root.data+" ");
        inorderTraversal(root.left);
        inorderTraversal(root.right);
    }

    static void postorderTraversal(Node root){
        if(root==null) return;
        
        inorderTraversal(root.left);
        inorderTraversal(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        int []nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=buildTree(nodes);

        System.out.println(root.left);
        postorderTraversal(root);
        System.out.println();

    }
}
