public class StringForwardAndBackwardEncoding_1 {
    public static void main(String[] args) {
        String str="AbcZ0";

        if(str.contains(" ")){
            System.out.println("Error");
            return;
        }

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            // for even index
            if(i%2==0){
                if(Character.isUpperCase(curr)){
                    if(curr=='Z'){
                        curr='B';
                    }else if(curr=='X'){
                        curr='A';
                    }else{
                        curr+=2;
                    }
                }
                else if(Character.isLowerCase(curr)){
                    if(curr=='z'){
                        curr='b';
                    }else if(curr=='x'){
                        curr='a';
                    }else{
                        curr+=2;
                    }
                }else{
                    if(curr=='8'){
                        curr='0';
                    }else if(curr=='9'){
                        curr='2';
                    }else{
                        curr+=2;
                    }
                }
            }else{

                if(Character.isUpperCase(curr)){
                    if(curr=='A'){
                        curr='Z';
                    }else{
                        curr-=1;
                    }
                }
                else if(Character.isLowerCase(curr)){
                    if(curr=='a'){
                        curr='z';
                    }else{
                        curr-=1;
                    }
                }else{
                    if(curr=='0'){
                        curr='9';
                    }else{
                        curr-=1;
                    }
                }

            }
            sb.append(curr);
        }
        System.out.println(sb.toString());
    }
}