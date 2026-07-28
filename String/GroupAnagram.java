import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            char [] arr= new char[26];
            for(char c:s.toCharArray()){
                arr[c-'a']++;
            }
            String curr= new String(arr);
            if(!map.containsKey(curr)){
                map.put(curr,new ArrayList<>());
            }
            map.get(curr).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String []arr={"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(arr);
    }
}


// TLE
// public List<List<String>> groupAnagrams(String[] strs) {
//     List<List<String>> res=new ArrayList<>();
//     boolean isVisited[]=new boolean[strs.length];
//     for(int i=0;i<strs.length;i++){
//         List<String> temp=new ArrayList<>();
//         if(isVisited[i]){
//             continue;
//         }
//         temp.add(strs[i]);
//         isVisited[i]=true;
//         // adding the first string and checking the next 
//         char []prev=strs[i].toCharArray();
//         Arrays.sort(prev);

//         for(int j=i+1;j<strs.length;j++){
//             if(isVisited[j]){
//                 continue;
//             }
//             char []curr=strs[j].toCharArray();
//             Arrays.sort(curr);
//             if(Arrays.equals(prev,curr)){
//                 isVisited[j]=true;
//                 temp.add(strs[j]);
//             }
//         }
//         res.add(temp);
//     }
//     return res;
// }
