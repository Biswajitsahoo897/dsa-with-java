package heaps;

import java.util.ArrayList;


public class HeapOperations {
    static ArrayList<Integer> list=new ArrayList<>();

    // swap logic 
    static void swap(int a,int b){
        int temp=list.get(a);
        list.set(a,list.get(b));
        list.set(b,temp);
    }
    static int peek(){
        return list.get(0);
    }
    static void add(int x){
        list.add(x);
        int idx=list.size()-1; //child index
                        // if child < parent then swap else continue 
        while (idx > 0 && list.get(idx) < list.get((idx - 1) / 2)) {
            int par=(idx-1)/2;
            swap(idx, par);
            idx = par;
        }
    }

    static void heapify(int i){
        int left=2*i+1;
        int right=2*i+2;

        int minIdx=i;
        int size=list.size();
        while(left<size && list.get(minIdx)>list.get(left)){
            minIdx=left;
        }
        
        while(right<size && list.get(minIdx)>list.get(right)){
            minIdx=right;
        }

        if(minIdx!=i){

            swap(i, minIdx);
            heapify(minIdx);
        }
    }
    static int deleteMin(){
        int data=list.get(0);
        // step1 swap the first and last element
        swap(0, list.size()-1);

        // step2 delete the last element
        list.remove(list.size()-1);

        heapify(0);
        return data;
    }

    static void printHeap(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        add(4);
        add(9);
        add(2);
        add(1);

        printHeap();
        deleteMin();
        printHeap();
    }
}
