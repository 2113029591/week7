import java.util.Scanner;

public class Practice_9_11 {
    public static void main(String[] args) {
        System.out.print("输入 a、b、c、d、e、f");
        Scanner input=new Scanner(System.in);
        LinearEquation le=new LinearEquation();
        le.setA(input.nextInt());
        le.setB(input.nextInt());
        le.setC(input.nextInt());
        le.setD(input.nextInt());
        le.setE(input.nextInt());
        le.setF(input.nextInt());
        if(!le.isSolvable()){
            System.out.println("The equation has no solution");
        }
        else {
            System.out.println(le.getX()+""+ le.getY());
        }
    }
}
class LinearEquation{
    private int a,b,c,d,e,f;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void setE(int e) {
        this.e = e;
    }

    public void setF(int f) {
        this.f = f;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

    public int getF() {
        return f;
    }
    public boolean isSolvable(){
        if(a*d-b*c!=0){
            return true;
        }
        else{
            return false;
        }
    }
    public double getX(){
        return (e*d-b*f)/(a*d-b*c);
    }
    public double getY(){
        return (a*f-e*c)/(a*d-b*c);
    }
}