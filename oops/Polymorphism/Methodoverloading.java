package oops.Polymorphism;

import Patterns.second;

public class Methodoverloading {
    int sum(int a,int b){
        return a+b;
    }
    double sum(double a,double b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    // int sum(int b,int a,int c){
    //     return a+b+c;
    // }this will give you an error bcz no of params and tye re same
    double sum(int a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        Methodoverloading m=new Methodoverloading();
        System.out.println(m.sum(444444, 444444444));
        System.out.println(m.sum(3,4.4));
        System.out.println(m.sum(2.3,2.3));
    }
}
