package Sorting;

public class countingSort {

    static String countSortString(String s) {
        char []ch=s.toCharArray();
        int []count=new int[26];
        for(char c:ch){
            count[c-'a']++;
        }
        int index=0;
        for(int i=0;i<26;i++){
            while(count[i]>0){
                ch[index++]=(char)(i+'a');
                count[i]--;
            }
        }
        return new String(ch);
    }
    static int[] countSortNumber(int []arr){
        int max=Integer.MIN_VALUE;
        // Find the max from the array of element 
        for(int i=0;i<arr.length;i++){
            max=Math.max(max, arr[i]);
        }

        // Then Make the cntarray of size => max+1
        int []countArr=new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]]++;
        }

        // Sorting
        int j=0;
        for (int i = 0; i < countArr.length; i++) {
            while (countArr[i]>0) {
                arr[j]=i;
                j++;
                countArr[i]--;
            }
        }
        return arr;
    }
    static void display(int []arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int []arr={1,4,7,2,1,10,9,8,3,6};
        String s="abfbfbsxs";
        System.out.println(countSortString(s));
        display(countSortNumber(arr));
    }
}
