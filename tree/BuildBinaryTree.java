package tree;

import java.util.LinkedList;
import java.util.Queue;

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
    static Node root=null;
    static int idx=-1;
    static Node buildTree(int []nodes){
        idx++;
        if(nodes[idx]==-1) return null;

        Node newNode=new Node(nodes[idx]);
        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);

        return newNode;
    }
    // left , root , right
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

    static void levelOrderTraversalBT(){
        // as we are maintaining a queue so the value will only remove by left Node and right Node(order)
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int size=q.size();

            for(int i=0;i<size;i++){
                Node curr=q.poll();
                System.out.print(curr.data+" ");
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            System.out.println();
        }

    }

    static int sumOfTreeNode(Node root){
        if(root==null){
            return 0;
        }
        return root.data+sumOfTreeNode(root.left)+sumOfTreeNode(root.right);
    } 

    static int hightOfTree(Node root){
        if(root==null) return 0;
        return 1+Math.max(hightOfTree(root.left),hightOfTree(root.right));
    }

    static int numberOfNodes(Node root){
        if(root==null) return 0;
        return 1+numberOfNodes(root.left)+numberOfNodes(root.right);
    }
    
    public static void main(String[] args) {
        int []nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        root=buildTree(nodes);

        // System.out.println(root.left);
        // postorderTraversal(root);
        // System.out.println();

        // levelOrderTraversalBT();

        // System.out.println(sumOfTreeNode(root));
        // System.out.println(hightOfTree(root));
        System.out.println(numberOfNodes(root));
    }
}
