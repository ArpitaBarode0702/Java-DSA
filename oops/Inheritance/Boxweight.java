package oops.Inheritance;

public class Boxweight extends Box {
    double weight;
    Boxweight(){
        //this.weight=weight;
       this.weight=super.weight;
    }
    Boxweight(double l,double d,double w,double weight){
        super(l,d,w);
        this.weight=weight;
    }
}
