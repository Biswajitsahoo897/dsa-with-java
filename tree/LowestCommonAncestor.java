package tree;

import java.util.ArrayList;

public class LowestCommonAncestor {

    static class Node {
        int data;
        Node left, right;
    
        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    
    static int idx = -1;
    
    static Node buildTree(int[] nodes) {
        idx++;
        if (nodes[idx] == -1) return null;
    
        Node root = new Node(nodes[idx]);
        root.left = buildTree(nodes);
        root.right = buildTree(nodes);
    
        return root;
    }

    static boolean getPath(Node root,int n,ArrayList<Node> path){
        if(root==null) return false;

        path.add(root);

        if(root.data==n) return true;
                
        if(getPath(root.left, n, path)|| getPath(root.right, n, path)){
            return true;
        }

        

        path.remove(path.size()-1);
        // removed the last index , if not required
        return false;
    }

    static Node lcaUsingList(Node root,int n1,int n2){
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        // for accessing it later
        int i=0;
        for(;i<path1.size()&&i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }

        Node lca=path1.get(i-1);
        return lca;
    }

    static Node lcaUsingRec(Node root,int n1,int n2){
        // base condition , check if the current node is that node then reutrn 
        if(root==null || root.data==n1  ||root.data==n2) return root;

        // calling for both left and right (DFS)
        // goes deep into left subtree then if not found or return then goes to right (simple DFS)
        
        Node leftlca=lcaUsingRec(root.left, n1, n2);
        Node rightlca=lcaUsingRec(root.right, n1, n2);

        if(rightlca==null && leftlca==null) return null;
        if(rightlca==null && leftlca!=null) return leftlca;
        if(rightlca!=null && leftlca==null) return rightlca;

        return root;
    }
    public static void main(String[] args) {
        int []nodes={10, 5, -1, 8, -1, -1, 20, 15, -1, -1, -1};
        Node root=buildTree(nodes);

        System.out.println(lcaUsingList(root, 8, 15).data);
        System.out.println(lcaUsingRec(root, 8, 15).data);
    }
}
