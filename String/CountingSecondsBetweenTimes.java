public class CountingSecondsBetweenTimes {
    public static void main(String[] args) {

        String startTime="13:40:34";
        String endTime="14:20:00";

        int h1=Integer.parseInt(startTime.substring(0,2));
        int h2=Integer.parseInt(endTime.substring(0,2));

        int m1=Integer.parseInt(startTime.substring(3,5));
        int m2=Integer.parseInt(endTime.substring(3,5));

        int s1=Integer.parseInt(startTime.substring(6));
        int s2=Integer.parseInt(endTime.substring(6));

        int total1=h1*3600+m1*60+s1;
        int total2=h2*3600+m2*60+s2;
        
        System.out.println((Math.abs(total1-total2)));
    }
}
