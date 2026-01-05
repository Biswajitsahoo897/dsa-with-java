package Bit_manipulation;

public class bitOperationOnInteger {
    static int getIthBit(int n, int i){
        int bitMask=1<<i;
        return (n&bitMask)==0?0:1;
    }
    static int setIthBit(int n,int i){
        int bitMask=1<<i;
        return n|bitMask;
    }
    static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return bitMask&n;
    }
    static int clearIthBitInRange(int n,int i,int j){
        int a=1<<j+1;
        int b=(1<<i)-1;
        int bitMask=a|b;
        return bitMask&n;
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(clearIthBitInRange(10, 2,4));
    }
}
