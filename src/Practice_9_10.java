import java.util.Scanner;

public class Practice_9_10 {
    public static void main(String[] args) {
        System.out.println("ax^2+bx+c=0");
        Scanner input=new Scanner(System.in);
        System.out.print("请输入a,b,c: ");
        QuadraticEquation num=new QuadraticEquation();
        num.setA(input.nextInt());
        num.setB(input.nextInt());
        num.setC(input.nextInt());
        if(num.getDiscriminant()<0){
            System.out.println("The equation has no roots");
        }
        else if(num.getDiscriminant()==0){
            System.out.println(num.getRoot1());
        }
        else {
            System.out.println(num.getRoot1()+" "+num.getRoot2());
        }
    }
}
class QuadraticEquation{
    private int a,b,c;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
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
    public int getDiscriminant(){
        return b*b-4*a*c;
    }
    public double getRoot1(){
        if(getDiscriminant()>=0){
            double t1=(-b+Math.sqrt(getDiscriminant()))/(2*a);
            return t1;
        }
        else {
            return 0;
        }
    }
    public double getRoot2(){
        if(getDiscriminant()>=0){
            double t2=(-b-Math.sqrt(getDiscriminant()))/(2*a);
            return t2;
        }
        else {
            return 0;
        }
    }
}
