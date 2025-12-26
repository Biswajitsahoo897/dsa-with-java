public class printCharFrequency {
    public static void main(String[] args) {
        String s="aabababccad";
        int []freq=new int[256];

        for (char c :s.toCharArray()) {
            freq[c]++;
        }

        for(char c :s.toCharArray()){
            if(freq[c]!=0){
                System.out.print(c+" : "+freq[c]+" , ");
                freq[c]=0;
            }
        }
    }
}
