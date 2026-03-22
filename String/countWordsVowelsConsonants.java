import java.util.Scanner;

public class countWordsVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            int consonants=0,vowels=0;
            s=s.toLowerCase().trim();
            for(int i=0;i<s.length();i++){
                char curr=s.charAt(i);
                if("aeiou".indexOf(curr)>=0){ //same as "aeiou".indexOf(curr)!= -1
                    vowels++;
                }
                else if(Character.isLetter(curr)){ //for only letters and not for spaces and special characters
                    consonants++;
                }
            }
            int words=s.isEmpty()?0:s.split("\\s+").length;
            
            System.out.println(words+" "+vowels+" "+consonants);
        }       
        sc.close();
    }
}
