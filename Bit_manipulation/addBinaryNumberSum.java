package Bit_manipulation;

public class addBinaryNumberSum {
    static int binToDec(String n){
        int num=0;
        String rev="";
        for (int j = n.length()-1; j >=0; j--) {
            rev+=n.charAt(j);
        }
        int i=0;
        while(i<n.length()){
            if(rev.charAt(i)=='1'){
                num+=Math.pow(2, i);
            }
            i++;
        }
        return num;
    }
    static String addBinaryF(String a, String b) {
        int sum=binToDec(a)+binToDec(b);
        int rem=0;
        String bin="";
        String revBinary="";
        while (sum>0) {
            rem=sum%2;
            bin+=rem;
            sum/=2;
        }
        for (int i = bin.length()-1; i >=0; i--) {
            revBinary+=bin.charAt(i);
        }
        return revBinary;
    }
    public static void main(String[] args) {
        System.out.println(addBinaryF("1101","11"));
        // System.out.println(binToDec("1011")+binToDec("1010"));
    }
}
