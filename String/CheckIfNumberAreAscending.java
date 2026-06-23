public class CheckIfNumberAreAscending {
    static boolean areNumbersAscending(String s) {
        int prev=0;        
        String str="";
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                str+=ch;
            }else{
                if(!str.isEmpty()){
                    int current=Integer.parseInt(str);
                    if(current<=prev){
                        return false;
                    }
                    prev=current;
                    str="";
                }
            }
        }
        // for the very last iteration
        if (!str.isEmpty()) {
            int current = Integer.parseInt(str);
            if (current <= prev) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="1 box has 3 blue 4 red 6 green and 12 yellow marbles";

        System.out.println(areNumbersAscending(s)); 

    }
}
