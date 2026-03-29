package heaps;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class NearByCarDistance {
// using compartors
    static public int[][] kClosest(int[][] p, int k) {
        Arrays.sort(p, Comparator.comparingInt(a -> a[0] * a[0] + a[1] * a[1]));
        return Arrays.copyOfRange(p, 0, k);
    }

    static class Point implements Comparable<Point>{
        int x;
        int y;
        int dist;
        int idx;

        public Point(int x,int y,int dist,int idx){
            this.x=x;
            this.y=y;
            this.dist=dist;
            this.idx=idx;
        }

        @Override
        public int compareTo(Point p2){
            return this.dist-p2.dist;
        }
    }
    public static void main(String[] args) {
        int points[][]={{3,3},{5,-1},{-2,4}};

        int k=2;
        PriorityQueue<Point> pq=new PriorityQueue<>();
        for (int i = 0; i < points.length; i++) {
            int distSquare=points[i][0]*points[i][0]+points[i][1]*points[i][1];
            pq.add(new Point(points[i][0], points[i][1], distSquare, i));
        }

        for(int i=0;i<k;i++){
            System.out.print("Car"+pq.remove().idx+" ");
        }

        kClosest(points, k);
    }
}
