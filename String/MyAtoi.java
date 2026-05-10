public class MyAtoi {
    static int myAtoi(String s) {
        //1.trimed
        s=s.trim();
        if(s.length()==0) return 0;

        //2. + or -
        int sign=s.charAt(0)=='-'?-1:1;
        if(s.charAt(0)=='-'||s.charAt(0)=='+'){
            s=s.substring(1);
        }
        long res=0;

        for(char ch:s.toCharArray()){
            if(!Character.isDigit(ch)){
                break;
            }
            res=res*10+(ch-'0');
            if(sign*res>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign*res<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }

        return ((int)res)*sign;
        
    }
    public static void main(String[] args) {
        String s="  -045dde";
        System.out.println(myAtoi(s));
    }

}
