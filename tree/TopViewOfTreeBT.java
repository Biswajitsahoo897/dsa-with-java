package tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewOfTreeBT {
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

    static class Info{
        Node node;
        int hd;

        Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }

    static void topView(Node root){
        // for Level order traversal(BFS)

        Queue<Info> q=new LinkedList<>();
        HashMap<Integer,Node> map=new HashMap<>();
        int min=0,max=0;
        
        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
                continue;
            }

            if(!map.containsKey(curr.hd)){
                map.put(curr.hd, curr.node);
            }

            if(curr.node.left!=null){
                q.add(new Info(curr.node.left, curr.hd-1));
                min=Math.min(min,curr.hd-1);
            }

            if(curr.node.right!=null){
                q.add(new Info(curr.node.right, curr.hd+1));
                max=Math.max(max,curr.hd+1);
            }

        }
        for(int i=min;i<max;i++){
            System.out.print(map.get(i).data+" ");
        }

        System.out.println();

    }


    public static void main(String[] args) {
        // preorder array
        int []nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=buildTree(nodes);
        topView(root);

    }
}
