import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ClosestPoint {
    
    public static double distance(int[] points){

        return Math.sqrt(points[0]*points[0] + points[1]*points[1]);

    }

    public static int[][] kClosest(int[][] points, int K) {
        
        Points[] data = new Points[points.length];

        for(int i=0;i<points.length;i++){

            data[i] = new Points(distance(points[i]), points[i]);

        }
        Collections.sort(data);

    
        return points;
    

    }

    public static void main(String[] args) {
        int[][] points = {{1,3},{-2,2}};
        kClosest(points, 1);

    }

}

class Points implements Comparator<Points>{


    public double distance;
    public int[] co_ordinate;

    public int compare(Points o1, Points o2) {
        return (o1.distance > o2.distance ? -1 : (o1.distance==o2.distance ? 0 : 1));
    }
    
    Points(double distance,int[] co){

        this.distance = distance;
        this.co_ordinate = co;

    }



}
