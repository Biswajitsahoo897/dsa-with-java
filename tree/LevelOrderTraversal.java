package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrderTraversal {
    static class Node{
        int data;
        Node left,right;
        Node(int value){
            this.data=value;
            left=right=null;
        }
    }

    static Node insert(Node root,int x){
        if(root==null) return new Node(x);
        if(root.data>x){
            root.left=insert(root.left, x);
        }
        if(root.data<x){
            root.right=insert(root.right, x);
        }
        return root; 
    }
    static void levelOrderTraversal(Node root){
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while (t-->0) {
            int n=sc.nextInt();
            Node root=null;
            while (n-->0) {
                root=insert(root,sc.nextInt());
                
            }
            levelOrderTraversal(root);
            System.out.println();
        }
        sc.close();
    }
}
