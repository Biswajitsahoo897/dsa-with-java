public class firstCharacterOfWordUpppercase {
    static String upperCaseWord(String s){
        StringBuilder sb=new StringBuilder();
        char ch=Character.toUpperCase(s.charAt(0));
        sb.append(ch);
        for (int i = 1; i <s.length(); i++) {
            if(s.charAt(i)==' '&&i<s.length()-1){
                sb.append(s.charAt(i++));
                sb.append(Character.toUpperCase(s.charAt(i)));
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    // Leetcode - 2129
    public static String capitalizeTitle(String title) {
        char[] ch = title.toCharArray();
		int len = ch.length;
		for(int i = 0; i < len; i++) {
			int firstIndex = i; 
			while(i < len && ch[i] != ' ') {
				ch[i] = Character.toLowerCase(ch[i]); 
				++i;
			}
			if(i - firstIndex > 2) {
				ch[firstIndex] =  Character.toUpperCase(ch[firstIndex]); 
			}
		}
		return String.valueOf(ch);
    }

    public static void main(String[] args) {
        String s="hey I am biswajit";
        System.out.println(upperCaseWord(s));
        System.out.println(capitalizeTitle(s));
    }

}
