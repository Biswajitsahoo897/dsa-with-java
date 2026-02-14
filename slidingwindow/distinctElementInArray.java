package slidingwindow;

import java.util.HashMap;

public class distinctElementInArray {
    public static void main(String[] args) {
        int []arr={4,-2,4,2,-4,-2,-4};
        int k=3; //window size
        int n=arr.length;

        HashMap<Integer,Integer> hmap=new HashMap<>();

        // created the first window 
        for(int i=0;i<k;i++){
            hmap.put(arr[i], hmap.getOrDefault(arr[i], 0)+1);
        }
        System.out.print(hmap.size()+" ");  
        // bcz as hashmap stores in key-value pair so the size will be the number of element 
        
        // slide window(goes to the next , by removing first element of the window)
        for(int i=k;i<n;i++){
            
            int out=arr[i-k];
            hmap.put(out,hmap.get(out)-1); //removing the element from the map
            
            if(hmap.get(out)==0){
                hmap.remove(out);
            }
            int in=arr[i]; // current element
            hmap.put(in, hmap.getOrDefault(in, 0)+1);
            System.out.print(hmap.size()+" ");  
        }

    }
}
