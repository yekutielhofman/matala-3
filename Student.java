package com.company;

import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Integer> grades;
    //banai
    public Student(String name) {
        this.name = name;
        this.grades = grades;
    }
    //method 1
    public Double studentAvg(){
        double total = 0;
        for(int i = 0; i<grades.size();i++){
            total += grades.get(i);
        }
        return total/grades.size();
    }
    //method 2
    public Boolean isTop(){
        if(studentAvg() >= 90) return true;
        else return false;
    }
    //method 3
    public Student better(Student other){
        if (this.studentAvg() > other.studentAvg()) return this;
        else return other;
    }
    //method 4
    public ArrayList<Integer> failures(){
        ArrayList<Integer> failures = new ArrayList<Integer>();
        for(int i = 0; i<grades.size();i++){
            if(grades.get(i)<=55) {
                failures.add(grades.get(i));
            }
        }
        return failures;
    }
}
