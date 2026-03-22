import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NumOfMonotonousSubstrings {
public static void main(String[] args) throws Exception {
        long M=1000000007;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        
        BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));        
        int t=Integer.parseInt(br.readLine());

        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            String str=br.readLine();

            long ans=0;
            long count=1;
            for(int i=1;i<n;i++){
                if(str.charAt(i)==str.charAt(i-1)){
                    count++;
                }
                else{
                    ans=(ans+(count*(count+1)/2)%M)%M;
                    count=1;
                }
            }
            ans=(ans+(count*(count+1)/2)%M)%M;
            
            // System.out.println(ans);
            wr.write(ans+"\n");
        }
        wr.flush();

    }
}
