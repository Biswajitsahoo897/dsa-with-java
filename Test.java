import java.util.Arrays;
// import java.util.Collections;

public class Test {
    public static void main(String[] args) {

        // int xor = 0;
        // int n=arr.length;
        // // Step 1: XOR all array elements
        // for (int num : arr) {
            //     xor ^= num;
            // }
            
            // // Step 2: XOR 1 to n
            // for (int i = 1; i <= n; i++) {
                //     xor ^= i;
                // }
                // System.out.println(10|1);
        // int []arr={1,5,7,2,4,5,6};
        // System.out.println(Arrays.stream(arr).max().getAsInt());
        // System.out.println(Arrays.stream(arr).min().getAsInt());
        // System.out.println(Arrays.stream(arr).sum());
        // StringBuilder sb=new StringBuilder();
        // String s="acbzq";
        // // sb.append("234123");
        // for(int i=0;i<s.length();i++){
        //     int currNum=s.charAt(i)-'a'+1;
        //     sb.append(currNum);
        // }
        // int num=Integer.parseInt(sb.toString());
        // System.out.println(num);
        // System.out.println(sb);
        String s="the book is right the ";
        s=s.trim();
        int len=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                len++;
            }
            else{
                break;
            }
        }
        System.out.println(len);
    }
}

/*
Note:
u can only use Collections.reverseOrder() in an Integer array not int array

*/