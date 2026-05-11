import java.util.HashMap;

public class CountNumberOfSubstring {
    //     Substrings with AT MOST 2 distinct
    // a
    // ab
    // aba
    // b
    // ba
    // a

    // Count = 6
    // Substrings with AT MOST 1 distinct
    // a
    // b
    // a
    // Count = 3 , now just substract from the atMost(k)-atMost(k-1) , we get substrings only contains k distinct substrings

    static int countSubstr(String s, int k) {
        return solve(s,k)-solve(s,k-1);
    }
    
    static int solve(String s,int k){
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0,r=0;
        int ans=0;
        
        while(r<s.length()){
            char currR=s.charAt(r);
            
            map.put(currR,map.getOrDefault(currR,0)+1);
            
            while(map.size()>k){
                char currL=s.charAt(l);
                
                map.put(currL,map.get(currL)-1);

                if(map.get(currL)==0){
                    map.remove(currL);
                }
                
                l++;
                
            }
            r++;
            ans+=(r-l+1);

        }
        return ans;
    }
    public static void main(String[] args) {
        String s="pqpqs"; 
        int k=2;

        System.out.println(countSubstr(s, k));
    }
}

// "pq", "pqp", "pqpq", "qp", "qpq", "pqs", "qs"