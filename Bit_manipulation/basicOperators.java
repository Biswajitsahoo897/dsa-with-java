package Bit_manipulation;

public class basicOperators {
    public static void main(String[] args) {
        int a = 29; // 11101 
        int b = 15; // 01111 

        // AND operator
        int andResult = a & b; // 11101 & 01111 = 01101 (13 in decimal)
        System.out.println("AND Operation: " + andResult);

        // OR operator
        int orResult = a | b; // 11101 | 01111 = 11111 (31 in decimal)
        System.out.println("OR Operation: " + orResult);

        // XOR operator
        // same bit gives 0, different bit gives 1
        int xorResult = a ^ b; // 11101 ^ 01111 = 10010 (18 in decimal)
        System.out.println("XOR Operation: " + xorResult);

        // NOT operator
        int notResult = ~a; // ~11101 = ...00010 (in 32-bit representation, it's -30 in decimal)
        System.out.println("NOT Operation: " + notResult);

        // Note:
        // Binary completment of the number 0 is -1


        //Formula for left shift operator a<<b = a * 2^b
        //Formula for right shift operator a>>b = a / 2^b

        // Left shift operator
        System.out.println("Left shift operator: " + (5 << 1)); // 5*2^2=20

        // Right shift operator
        System.out.println("Right shift operator: " + (20 >> 2)); // 20/2^2=5

    }
}
