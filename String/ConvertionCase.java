public class ConvertionCase {
    public static void main(String[] args) {
        StringBuilder res=new StringBuilder();
        String str="hEllO";

        for (int i = 0; i <str.length(); i++) {
            char curr=str.charAt(i);
            res.append((char)(curr^32));
        }
        System.out.println(res);
    }
}
