package queue;
import java.io.*;
import java.util.*;

public class windowMaximumElement {

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        
        BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));     
        
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n,k;
            String []input=br.readLine().split(" ");
            n=Integer.parseInt(input[0]);
            k=Integer.parseInt(input[1]);

            String []inp=br.readLine().split(" ");
            int []arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(inp[i]);
            }

            Deque<Integer> d=new ArrayDeque<>();
            long sum=0;
            for(int i=0;i<n;i++){
                // remove from the window
                if(!d.isEmpty() && d.peekFirst()==i-k){
                    d.pollFirst();
                }
                // dec order
                while(!d.isEmpty() && arr[d.peekLast()]<=arr[i]){
                    d.pollLast();
                }
                d.offerLast(i);

                if(i>=k-1){
                    sum+=arr[d.peekFirst()];
                }
            }
            wr.write(sum+"\n");
        }
        wr.flush();
        
    }
}


