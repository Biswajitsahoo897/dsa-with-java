import java.util.HashMap;

public class MaxNumberOfBalloon {
    static int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map=new HashMap<>();
        String str="balon";
        for(int i=0;i<text.length();i++){
            char curr=text.charAt(i);
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
                        
        int count=Integer.MAX_VALUE;
        for(char ch:str.toCharArray()){
            int curr=map.getOrDefault(ch,0);

            if(ch=='l'||ch=='o'){
                curr/=2;
            }

            count=Math.min(curr,count);
        }
        return count; 

    }
    public static void main(String[] args) {
        String s="loonbalxballoon";
        System.out.println(maxNumberOfBalloons(s));
    }
}
