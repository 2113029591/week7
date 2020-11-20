import java.util.Random;

public class Practice_9_4 {
    public static void main(String[] args) {
        Random random=new Random(1000);
        int i=0;
        while(i<50){
            int number=random.nextInt(100);
            System.out.println(i+1+": "+number);
            i++;
        }
    }
}
