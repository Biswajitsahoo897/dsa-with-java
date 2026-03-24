import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class AnagramicGroupString {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            HashSet<String> set=new HashSet<>();
            while(n-->0){
                String str=sc.next();
                int []freq=new int[26];
                for(int i=0;i<k;i++){
                    freq[str.charAt(i)-'a']++;
                }

                String key=Arrays.toString(freq); //converting the freq array into the string then comparing the string key with the upcoming key
                // as the hashSet only stores the unique string so the size will return the unique anagram string
                set.add(key);
            }
            System.out.println(set.size());
        }
        sc.close();
    }
}
