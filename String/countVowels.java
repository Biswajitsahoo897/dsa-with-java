import java.util.Scanner;

public class countVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "hello";
        int count = 0;
        for(char c : s.toCharArray()){
            if("aeiouAEIOU".indexOf(c) != -1){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
