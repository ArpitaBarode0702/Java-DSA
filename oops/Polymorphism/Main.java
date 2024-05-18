package oops.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes s=new Shapes();
        s.area();
        Circle c=new Circle();
        c.area();
        Shapes s2=new Circle();
        s2.area();//this will going to print circle area
        //bcz it is depands on the type of objedct  which method is to call not on the type of refrence variable,type of reference variable is responsible for 
        // which properties are accessable .note is area is not present in Shape then it will give error bcz circle is only call when the same is present in shape.
    }
}
