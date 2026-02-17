package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelectionProblem {
    static void activitySelectionSorted(){
        int []start={1,3,0,5,8,5};
        int []end={2,4,6,7,9,9};
        int m=end.length;
        int i=0,j=1;
    
        ArrayList<Integer> alist=new ArrayList<>();
        alist.add(0);
        while(j<m){
            if(end[i]<=start[j]){
                alist.add(j);
                i=j;
            }
            j++;
        }
        System.out.println(alist.size());
        
        for (int id : alist) {
            System.out.print("A"+id+ " ");
        }
        System.out.println();
    }

    static void activitySelectionUnSorted(){
        int []start={0,1,3,5,5,8};
        int []end={6,2,4,7,9,9};

        int [][]activity=new int[start.length][3];

        for (int i = 0; i < activity.length; i++) {

            activity[i][0]=i; //index
            activity[i][1]=start[i]; //start time 
            activity[i][2]=end[i]; //end time 
            
        }
        
        // Lambada Expression in java 
        // Comparator is an interface for sorting java objects. only sorted the end time
        Arrays.sort(activity, Comparator.comparingDouble(o->o[2]));
        
        int m=activity.length;
        int i=0,j=1;
    
        ArrayList<Integer> alist=new ArrayList<>();
        alist.add(activity[0][0]);
        while(j<m){
            if(activity[i][2]<=activity[j][1]){
                alist.add(activity[j][0]);
                i=j;
            }
            j++;
        }
        System.out.println(alist.size());
        
        for (int id : alist) {
            System.out.print("A"+id+ " ");
        }

    }
    public static void main(String[] args) {
        activitySelectionSorted(); //if the end time is sorted

        activitySelectionUnSorted();
    }
}