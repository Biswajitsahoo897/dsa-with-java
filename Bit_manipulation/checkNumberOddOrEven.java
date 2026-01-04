package Bit_manipulation;

public class checkNumberOddOrEven{
    public static void main(String[] args) {
        int n=82;
        if((n&1)==1){
            System.out.println("Number is odd.");
        }
        else{
            System.out.println("Number is even.");
        }
    }
}

// Note :
/*
A bit is the smallest unit of data;
0 or 1
MSB-Most Significant Bit (basically the leftmost bit)
    0-positive
    1-negative

LSB- Least significant bit (Right most bit)
    0-even
    1-odd

*/