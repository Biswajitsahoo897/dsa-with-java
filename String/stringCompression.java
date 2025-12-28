public class stringCompression {
    static String compress(String s){
        String newStr="";
        int n=s.length();
        for (int i = 0; i <n-1; i++) {
            Integer count=1;
            while (i<n-1 && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }
            newStr+=s.charAt(i);
            if(count>1){
                newStr+=count.toString();
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        // Method - 01
        StringBuffer sb=new StringBuffer();
        String s="aaabbbbccddd";
        int []freq=new int[256];
        for(char c:s.toCharArray()){
            freq[c]++;
        }
        for(char c:s.toCharArray()){
            if(freq[c]!=0){
                sb.append(c);
                sb.append(freq[c]);
                // System.out.print(freq[c]);
                freq[c]=0;
            }
        }
        System.out.println(sb);
        
        // Method - 02

        System.out.print(compress(s));

    }
}
