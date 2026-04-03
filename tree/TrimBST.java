package tree;

import java.util.*;
public class TrimBST {

    static class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value=value;
            left=null;
            right=null;
        }
    }
    static Node insert(Node root,int x){
        if(root==null) return new Node(x);
        if(root.value<x){
            root.right=insert(root.right,x);
        }
        else if(root.value>x){
            root.left=insert(root.left,x);
        }
        return root;
    }
    static void preOrder(Node root){
        if(root==null) return ;

        System.out.print(root.value+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static Node trimBST(Node root,int L,int R){
        if(root==null)return null;

        if(root.value<L) return trimBST(root.right,L,R);
        if(root.value>R) return trimBST(root.left,L,R);

        root.left=trimBST(root.left,L,R);
        root.right=trimBST(root.right,L,R);
        return root;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
    
            int n=sc.nextInt();
            int L=sc.nextInt();
            int R=sc.nextInt();
            Node root=null;
            for(int j=0;j<n;j++){
                root=insert(root,sc.nextInt());
            }

            root=trimBST(root,L,R);
            preOrder(root);
            System.out.println();
        }       
        sc.close();
    }
}

