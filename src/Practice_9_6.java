import java.util.Date;

public class Practice_9_6 {
    public static void main(String[] args) {
        StopWatch time=new StopWatch();
        time.start();
        for(long i=0;i<10000;i++){
            for(long j=0;j<100000;j++){};
        }
        time.stop();
        System.out.println(time.getElapsedTime());

    }
}
class StopWatch {
    Date date=new Date();
    private Date startTime,endTime;
    public StopWatch(){
        this.startTime=date;
    }
    public Date start(){
        date=new Date();
        this.startTime=date;
        return startTime;
    }
    public Date stop(){
        date= new Date();
        this.endTime=date;
        return endTime;
    }
    public long getElapsedTime(){
        return endTime.getTime()-startTime.getTime();
    }
}
