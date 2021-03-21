package com.makhabatusen.testingcw6.domain;


public class Math {
    public double add(double a, double b) {
        double res = a+b;
        return (int)(java.lang.Math.round(res * 100))/100.0;
    }

    public double subtract(double a, double b) {
        double res = a - b;
        return (int)(java.lang.Math.round(res * 100))/100.0;
    }


    public double divide(double a, double b) {
        if (b == 0) {
            return 0;
        } else {
            double res = a / b;
            return (int)(java.lang.Math.round(res * 100))/100.0;
        }
    }

    public double multiply(double a, double b) {
        if (b == 0) {
            return 0;
        } else {
            double res = a * b;
            return (int)(java.lang.Math.round(res * 100))/100.0;
        }
    }

    public double pow(double value, double powValue) {
         return  java.lang.Math.pow(value, powValue);

    }


    public double sqrt(double value) {

        double sqrt = (double) java.lang.Math.sqrt(value);
        return (int)(java.lang.Math.round(sqrt * 100))/100.0;

    }
}
