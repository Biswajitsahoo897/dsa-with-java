package backtracking;

public class FindSubset {
    static void findsubset(String str,String ans,int i){
        // base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("Null");
            }else{
            System.out.println(ans);
            }
            return;
        }

        // Yes choice
        findsubset(str, ans+str.charAt(i), i+1);

        // No choice
        findsubset(str, ans, i+1);

    }
    public static void main(String[] args) {
        String s="abc";
        findsubset(s, "", 0);
    }
}
