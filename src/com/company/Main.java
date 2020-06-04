package com.company;

public class Main {

    public static void main(String[] args) {
        Kwadrat kwadrat=new Kwadrat(5);
        System.out.println("Powierzchnia kwadratu to: "+ kwadrat.obliczPowierzchnie());
        Trojkat trojkat=new Trojkat(5, 4,2);
        System.out.println("Pole trojkata to: " + trojkat.obliczPowierzchnie());
    }
}
interface Ksztalt{
    double obliczPowierzchnie();
    double obliczObwod();
}

class Kwadrat implements Ksztalt{
    double dlugoscBoku;
    public Kwadrat(double dlugoscBoku)
    {
        this.dlugoscBoku=dlugoscBoku;
    }


    @Override
    public double obliczPowierzchnie(){

        return dlugoscBoku*dlugoscBoku;
    }

    @Override
    public double obliczObwod() {
        return 4*dlugoscBoku;
    }


}
class Trojkat implements Ksztalt{
    double a;
    double b;
    double c;
public Trojkat(double a, double b, double c){
    this.a=a;
    this.b=b;
    this.c=c;
}
    @Override
    public double obliczPowierzchnie() {
        double p=(a+b+c)/2;
     return Math.sqrt(p*(p-a)*(p-b)*(p-c));

    }

    @Override
    public double obliczObwod() {
        return a+b+c;
    }
}
