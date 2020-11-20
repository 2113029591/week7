import java.util.Date;
import java.util.GregorianCalendar;

public class Practice_9_5 {
    public static void main(String[] args) {
        GregorianCalendar time=new GregorianCalendar();
        System.out.println(time.get(GregorianCalendar.YEAR)+"/"+
                (time.get(GregorianCalendar.MONTH)+1)+"/"+
                +time.get(GregorianCalendar.DATE));
        time.setTimeInMillis(1234567898765L);
        System.out.println(time.get(GregorianCalendar.YEAR)+"/"+
                (time.get(GregorianCalendar.MONTH)+1)+"/"+
                +time.get(GregorianCalendar.DATE));
    }
}
