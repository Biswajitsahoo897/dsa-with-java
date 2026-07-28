public class SmallestPalindromeLexicographically {
    static String smallestPalindrome(String s) {

        int []freq=new int[26];
        int n=s.length();
        int left=0;
        int right=n-1;
        char res[]=new char[n];
        // count the freq of the array first 
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }

        // assign it to the left and right and -2
        for(int i=0;i<26;i++){
            while(freq[i]>=2){
                char ch=(char)(i+97); //('a'+i) same thing
                res[left++]=ch;
                res[right--]=ch;
                freq[ch-'a']-=2;
            }
        }

        for(int i=0;i<26;i++){
            if(freq[i]==1){
                res[left]=(char)(i+97);
            }
        }
        return new String(res);
    }
    public static void main(String[] args) {
        String s ="bbaaacc";
        System.out.println(smallestPalindrome(s));
    }
}
