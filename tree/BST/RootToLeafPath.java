package tree.BST;

import java.util.ArrayList;
import java.util.Scanner;

public class RootToLeafPath {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }

    static Node insert(Node root,int value){
        if(root==null) return new Node(value);
        else if(root.data<value){
            root.right=insert(root.right, value);
        }
        else{
            root.left=insert(root.left, value);
        } 
        return root;
    }

    static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    
    static void rootToLeaf(Node root,ArrayList<Integer> path){
        if(root==null ){
            return;
        }
        path.add(root.data);
        // add the nodes until node.left and node.right becomes null
        
        if(root.left==null && root.right==null){
            System.out.println(path);
        }
        else{
            rootToLeaf(root.left, path);
            rootToLeaf(root.right, path);
        }
        // backtracking step
        path.remove(path.size()-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element:");
        int numberOfEle=sc.nextInt();
        Node root=null;

        while(numberOfEle-->0){
            System.out.println("enter the element("+numberOfEle+"):");
            int value=sc.nextInt();
            root=insert(root, value);
        }
        inorder(root);
        System.out.println();
        rootToLeaf(root, new ArrayList<>());
        sc.close();
    }
}
