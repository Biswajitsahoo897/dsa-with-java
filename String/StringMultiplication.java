public class StringMultiplication {
    static String multiply(String num1, String num2) {
        int m=num1.length();
        int n=num2.length();

        int []posOfPro=new int[n+m];

        StringBuilder sb=new StringBuilder();
        // right -> left
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                int pro=((num1.charAt(i)-'0')*(num2.charAt(j)-'0'));
                int sum=pro+posOfPro[i+j+1];
                posOfPro[i+j+1]=sum%10; //last number 
                posOfPro[i+j]+=sum/10; //carry step
            }
        }

        for(int x:posOfPro){
            if(sb.length()>0 || x>0){ // if x is zero then simply ignore
                sb.append(x);
            }
        }

        return sb.length()==0?"0":sb.toString(); //if the input is 0

    }
    public static void main(String[] args) {
        String s1="182";
        String s2="358";

        System.out.println(multiply(s1, s2));
    }
}

