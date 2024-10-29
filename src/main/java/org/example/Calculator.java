package org.example; //fixed problem with importing in test file

public class Calculator {

    public boolean isOdd(int num){
        return num % 2 == 1;            //returns odd values
    }

    public int add(int a, int b) {
        return a + b;
    }           //covered

    public int subtract(int a, int b) {
        return a - b;
    }           //covered

    public int multiply(int a, int b) {
        return a * b;
    }           //covered

    public double divide(int a, int b) {
        return (double) a / (double) b;
    }           //covered

    public double squareRootOf(int a) {           //covered
        return Math.sqrt(a);
    }

    public double getArea(int a) {
        if (a < 0) {
            return Double.NaN;
        }
        double area = Math.PI * (a * a);
        return Math.round(area * 100.0) / 100.0;
    }

    public double getCircumference(int a) {
        if (a < 0) {
            return Double.NaN;
        }
        double circumference = Math.PI * 2 * a;
        return Math.round(circumference * 100.0) / 100.0;
    }
}
