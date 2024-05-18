package oops.Inheritance;

public class Box {
    double l;
    double w;
    double d;
    double weight;
    Box(){//if no argument is provided while making object then it will call this constructor
        this.l=-1;
        this.w=-1;
        this.d=-1;
        this.weight=3;
    }
    Box(double l,double w,double d){
        this.l=l;
        this.w=w;
        this.d=d;
    }
    Box(double side){
        this.w=side;
    }
    public static void info(){
        System.out.println("Hello from Arpita");
    } 
}
