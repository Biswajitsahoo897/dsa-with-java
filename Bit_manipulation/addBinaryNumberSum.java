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

// Leetcode - 67 
// Expected solution

class solution{
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1) {
        if (i >= 0)
            carry += a.charAt(i--) - '0';
        if (j >= 0)
            carry += b.charAt(j--) - '0';
        sb.append(carry % 2);
        carry /= 2;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        solution sol = new solution();
        String result = sol.addBinary("1101", "11");
        System.out.println(result); // Output: "10000"
    }
}
