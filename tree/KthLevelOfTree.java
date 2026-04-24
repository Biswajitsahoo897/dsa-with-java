package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KthLevelOfTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=this.right=null;
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

    // iterative method 
    static void kthLevelNodes(Node root,int k){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        ArrayList<Integer> arr=new ArrayList<>();

        int level=1;
        while (!q.isEmpty()) {
            int size=q.size();
            for (int i = 0; i <size; i++) {
                
                Node curr=q.poll();
                
                if(level==k){
                    arr.add(curr.data);
                }

                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
                
            }
            level++;        
        }
        for(Integer x:arr){
            System.out.print(x+" ");
        }

    }
    
    // recursive method
    static void kthLevelNodesRec(Node root,int level,int k){

        if(root==null) return ;
        if(level==k) {
            System.out.print(root.data+" ");
            return;
        }

        kthLevelNodesRec(root.left, level+1, k);
        kthLevelNodesRec(root.right, level+1, k);
        
    }
    public static void main(String[] args) {
        int[] nodes = {10, 5, -1, 8, -1, -1, 20, 15, -1, -1, -1};
        Node root=buildTree(nodes);
        int k=2;
        kthLevelNodes(root,k);
        kthLevelNodesRec(root, 1, k);
        
    }
}
