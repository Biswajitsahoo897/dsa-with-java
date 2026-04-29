public class LongestCommonPrefix {
    public static void main(String[] args) {
        String []strs={"flower","flow","flight"};
        StringBuilder sb=new StringBuilder();

        char[]first=strs[0].toCharArray();
        char[]second=strs[strs.length-1].toCharArray();

        for(int i=0;i<first.length;i++){
            if(first[i]!=second[i]){
                break;
            }
            sb.append(first[i]);
        }
        System.out.println(sb.toString());
    }
}
