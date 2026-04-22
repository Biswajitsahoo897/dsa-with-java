package tree;

public class DiameterOfTree {
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

    static int hightOfTree(Node root){
        if(root==null) return 0;
        return 1+Math.max(hightOfTree(root.left),hightOfTree(root.right));
    }

    static int diameterOfTree(Node root){

        if(root==null) return 0;
        int lDia=diameterOfTree(root.left);
        int rDia=diameterOfTree(root.right);

        int lHeight=hightOfTree(root.left);
        int rHeight=hightOfTree(root.right);

        int selfDia=rHeight+lHeight+1;

        return Math.max(selfDia,Math.max(rDia, lDia));

    }

    public static void main(String[] args) {
        int []nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        root=buildTree(nodes);

        System.out.println(diameterOfTree(root));
    }
}
