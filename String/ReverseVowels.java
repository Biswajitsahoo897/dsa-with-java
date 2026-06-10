public class ReverseVowels {
    static String reverseVowelsMethod1(String s){

        StringBuilder res=new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            if("aeiouAEIOU".indexOf(s.charAt(i))>=0){
                res.append(s.charAt(i));
            }
        }
        res.reverse(); // only contains vowels
        int index=0;
        String ans=""; 
        for(int i=0;i<s.length();i++){
            if("aeiouAEIOU".indexOf(s.charAt(i))>=0){
                ans+=res.charAt(index);
                index++;
            }
            else{
                ans+=s.charAt(i);;
            }
        }
        return ans;
    }


    static String reverseVowelsUsingTwoPointer(String s){
        int l=0,r=s.length()-1;
        char []res=s.toCharArray();

        String vowels="AEIOUaeiou";
        while(l<r){
            while(l<r && vowels.indexOf(res[l])==-1){ //MEANS IT'S CONSONANT
                l++;
            }
            while(l<r && vowels.indexOf(res[r])==-1){ //MEANS IT'S CONSONANT
                r--;
            }
            
            // swap
            if(l<r){
                char temp=res[l];
                res[l]=res[r];
                res[r]=temp;

                l++;
                r--;
            }
        }

        return new String(res );
    }
    public static void main(String[] args) {
        String s="IceCreAm";
        System.out.println(reverseVowelsUsingTwoPointer(s));
        System.out.println(reverseVowelsMethod1(s));
    }
}
