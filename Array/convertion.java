package Array;
public class convertion {
    public static void binaryToDecimal(int a) {
        int length=0,digit=0,sum=0;
        int original =a;
        while (a>0) {
            a/=10;
            length++;
        }
        System.out.println(length);
        a=original;
        for (int i = 0; i < length; i++) {
            int last=a%10;
            a/=10;
            if (last==1) {
                digit =(int)Math.pow(2, i);
                sum+=digit;
            }
            continue;
        }
        System.out.println("Decimal of " + original + " is : "+sum);

    }

    public static void decimalToBinary(int b){
        int original=b;
        int rem=0;
        String bin="";
        String revBinary="";
        while (b>0) {
            rem=b%2;
            bin+=rem;
            b/=2;
        }
        for (int i = bin.length()-1; i >=0; i--) {
            revBinary+=bin.charAt(i);
        }
        System.out.println("Binary of "+original+" is :"+revBinary);
    }
    
    public static void main(String[] args) {
        binaryToDecimal(10010110);
        decimalToBinary(24);
    }
    
}