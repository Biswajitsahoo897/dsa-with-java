package tree;
import java.util.*;
public class BSTOperations {

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
    static Node delete(Node root,int x){
        if(root==null) return null;
        if(root.value>x){
            root.left=delete(root.left,x);
        }
        else if(root.value<x){
            root.right=delete(root.right,x);
        }
        else if(root.value==x){
            if(root.right==null){
                return root.left;
            }
            if(root.left==null){
                return root.right;
            }
            Node temp=findMin(root.right);
            root.value=temp.value;
            root.right=delete(root.right,temp.value);
        
        }
        return root;
    }
    static boolean search(Node root,int x){
        if(root==null) return false;
        if(root.value==x){
            return true;
        }
        if(root.value<x) return search(root.right,x);
        else return search(root.left,x);
    }
    static Node findMin(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.value+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    
    static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.value+" ");
        inOrder(root.right);
    }

    static void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value+" ");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            System.out.println("Case #"+i+":");
            int n=sc.nextInt();
            Node root=null;
            while(n-->0){
                int type=sc.nextInt();
                
                if(type==1){
                    int val=sc.nextInt();
                    root=insert(root,val);
                }
                else if(type==2){
                    int val=sc.nextInt();
                    root=delete(root,val);
                }
                else if(type==3){
                    int val=sc.nextInt();
                    if(search(root,val)){
                        System.out.println("Yes");
                    }else{
                        System.out.println("No");
                    }
                }else{
                    if(root==null){
                        System.out.println("null");
                        continue;
                    }
                    preOrder(root);
                    System.out.println();
                }
            sc.close();

            }
        }       
        
    }
}
