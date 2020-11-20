import java.util.Date;

public class Practice_9_3 {
    public static void main(String[] args) {
        long time=10000;
        Date date=new Date(time);
        System.out.println(time+" "+date.toString());
        time*=10;
        for(int i=0;i<7;i++){
            date.setTime(time);
            System.out.println(time+" "+date.toString());
            time*=10;
        }
    }
}
