package collections;

// import java.util.HashSet;
import java.util.TreeSet;

public class UnionAndIntersectionOfArray {
    public static void main(String[] args) {
        int []a={3,1,5,9,10,6,8};
        int []b={10,6,8,7,2};

        // HashSet<Integer> set=new HashSet<>();
        TreeSet<Integer> set=new TreeSet<>(); //for sorted order
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }
        System.out.println(set);
        TreeSet<Integer> intersection=new TreeSet<>();
        set.clear();

        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            if(set.contains(b[i])){
                intersection.add(b[i]);
                set.remove(b[i]);
            }
        }
        System.out.println(intersection);
    }
}
