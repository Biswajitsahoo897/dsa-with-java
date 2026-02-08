package backtracking;

public class FindSubset {
    static void findsubset(String str,StringBuilder ans,int i){
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
        findsubset(str, ans.append(str.charAt(i)), i+1);

        // No choice
        findsubset(str, ans.deleteCharAt(ans.length()-1), i+1);
        

    }
    public static void main(String[] args) {
        String s="abc";
        StringBuilder ans=new StringBuilder();
        findsubset(s, ans, 0);
    }
}
