package com.company;

public class Point {
    Double width;
    Double height;
    //banai
    public Point(Double width, Double height){
        this.width = width;
        this.height = height;
    }
    //method 1
    public Point middle(Point x){
        double width = (x.width + this.width)/2;
        double height = (x.height + this.height)/2;
        Point z = new Point(width, height);
        return z;
    }
    // method 2
    public Double distance(Point x){
        return Math.sqrt(Math.pow((x.height - this.height),2)+Math.pow((x.width - this.width),2));
    }
    //method 3
    public Double areaSize(Point x, Point y){
        return (x.width*(y.height-this.height)+y.width*(x.height-this.height)+ this.width*(x.height-y.height))/2;
    }
    //method 4
    public Double slope(){
        return this.height/this.width;
    }
}
