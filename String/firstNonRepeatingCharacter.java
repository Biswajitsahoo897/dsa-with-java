public class firstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s ="aabababyt";
        boolean found=false;
        int []freq=new int[256];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        for (char c : s.toCharArray()) {
            if(freq[c]==1){
                System.out.print(c+" : "+freq[c]);
                found=true;
                break;
            }
        }
        if (!found) {
            System.out.print(-1);
        }
    }
}
