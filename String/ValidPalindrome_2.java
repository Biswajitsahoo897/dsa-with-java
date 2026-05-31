public class ValidPalindrome_2 {
    static boolean validPalindrome(String s) {
        int p1=0;
        int p2=s.length()-1;
        while(p1<p2){
            if(s.charAt(p1)!=s.charAt(p2)){
                return isPalindrome(p1+1,p2,s)|| isPalindrome(p1,p2-1,s);
            }
            p1++;
            p2--;
        }
        return true;
    }
    static boolean isPalindrome(int p1,int p2,String s){
        while(p1<p2){
            if(s.charAt(p1++)!=s.charAt(p2--)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="deddde";
        System.out.println(validPalindrome(s));
    }
}
