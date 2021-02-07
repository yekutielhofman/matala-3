package com.company;

public class Rational {
    int numerator;
    int denominator;
    //banai
    public Rational(int num, int denom){
        this.numerator = num;
        this.denominator = denom;
    }
    //method 1
    public Rational add(Rational r){
        int res = 0;
        int com = denominator * r.denominator;
        res = this.numerator * r.denominator + r.numerator * this.denominator;
        Rational x = new Rational(res,com);
        x.reduce();
        return x;
        }
    //method 2
    public Rational mul(Rational r){
        Rational res = new Rational(this.numerator*r.numerator,this.denominator*r.denominator);
        res.reduce();
        return res;
    }
    //method 3
    public void reduce() {
        int min = Math.min(numerator, denominator);
        for (int i = min; i > 1; i--) {
            if (numerator % i == 0 && denominator % i == 0) {
                numerator /= i;
                denominator /= i;
            }
        }
    }
        //method 4
        public Rational bigger(Rational r){
            int x = numerator * r.denominator;
            int y = r.numerator * denominator;
            if (x>y) return this;
            return r;
        }

}
