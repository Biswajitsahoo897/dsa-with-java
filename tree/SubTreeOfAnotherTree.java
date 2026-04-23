package tree;

public class SubTreeOfAnotherTree {
    static class Node{
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

    static boolean isIdentical(Node root,Node subRoot){
        // if both are null then identical 
        if(root==null && subRoot==null) return true;

        if(root==null || subRoot==null ){
            return false;
        }
        if(root.data!=subRoot.data) return false;

        if(!isIdentical(root.left, subRoot.left)){
            return false;
        }

        if(!isIdentical(root.right, subRoot.right)){
            return false;
        }
        return true;
    }
    static boolean isSubTree(Node root,Node subRoot){
        // base case
        if(root==null) return false;
        
        if(root.data==subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
            isSubTree(root.left, subRoot);
        }
        
        return isSubTree(root.left, subRoot)||isSubTree(root.right, subRoot);
    }
    public static void main(String[] args) {
        int []nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int []sub={5,-1,-1,3,-1,6,-1,-1};
        Node root=buildTree(nodes);
        idx=-1;
        Node subTree=buildTree(sub);

        System.out.println(isSubTree(root, subTree));

    }
}