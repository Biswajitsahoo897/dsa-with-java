public class palindromeCheck {
    static boolean palindromeCheckUsingWhile(String s){
        boolean flag=true;
        int l=0,r=s.length()-1;
        while (l<r) {
            if(s.charAt(l)!=s.charAt(r)){
                flag=false;
                break;
            }
            l++;
            r--;
        }
        return flag;
    }
    static boolean palindromeCheckUsingFor(String s){
        String original=s;
        String rev="";
        for (int i = s.length()-1; i >=0; i--) {
            rev+=s.charAt(i);
        }
        if(original.equals(rev)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s="malayalam";
        System.out.println(palindromeCheckUsingWhile(s));
        System.out.println(palindromeCheckUsingFor(s));
    }
}
